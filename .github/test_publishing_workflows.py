#!/usr/bin/env python3

import os
import re
import subprocess
import tempfile
import textwrap
import unittest
from pathlib import Path


ROOT = Path(__file__).resolve().parents[1]
SNAPSHOT_WORKFLOW = ROOT / ".github/workflows/snapshot.yml"
RELEASE_WORKFLOW = ROOT / ".github/workflows/publish.yml"

SNAPSHOT_GRADLE_ARGUMENTS = [
    "fetch-native-dependencies",
    "assemble",
    "build",
    "publishToMavenCentral",
    "-x",
    ":kextract:test",
    "-x",
    ":demo:common:testDebugUnitTest",
    "--info",
]
RELEASE_GRADLE_ARGUMENTS = [
    "fetch-native-dependencies",
    "assemble",
    "build",
    "publishToMavenCentral",
    "-x",
    ":kextract:test",
    "--info",
]
SECRET_MAPPINGS = [
    "ORG_GRADLE_PROJECT_mavenCentralUsername: ${{ secrets.SONATYPE_LOGIN }}",
    "ORG_GRADLE_PROJECT_mavenCentralPassword: ${{ secrets.SONATYPE_PASSWORD }}",
    "ORG_GRADLE_PROJECT_signingInMemoryKey: ${{ secrets.PGP_PRIVATE }}",
    "ORG_GRADLE_PROJECT_signingInMemoryKeyPassword: ${{ secrets.PGP_PASSPHRASE }}",
]


def workflow_script(path: Path) -> str:
    lines = path.read_text().splitlines()
    start = next(index for index, line in enumerate(lines) if line.strip() == "run: |")
    indent = len(lines[start]) - len(lines[start].lstrip())
    block = []
    for line in lines[start + 1 :]:
        if line.strip() and len(line) - len(line.lstrip()) <= indent:
            break
        block.append(line)
    return textwrap.dedent("\n".join(block))


def execute_workflow_script(path: Path, version: str):
    with tempfile.TemporaryDirectory() as directory:
        directory_path = Path(directory)
        marker = directory_path / "gradle-arguments"
        gradlew = directory_path / "gradlew"
        gradlew.write_text(
            "#!/usr/bin/env bash\n"
            "printf '%s\\n' \"$@\" > \"$GRADLE_MARKER\"\n"
        )
        gradlew.chmod(0o755)
        environment = os.environ.copy()
        environment.update(VERSION=version, GRADLE_MARKER=str(marker))
        result = subprocess.run(
            ["bash", "-c", workflow_script(path)],
            cwd=directory_path,
            env=environment,
            text=True,
            capture_output=True,
            check=False,
        )
        arguments = marker.read_text().splitlines() if marker.exists() else None
        return result, arguments


class PublishingWorkflowRoutingTest(unittest.TestCase):
    def assert_accepted(self, path: Path, version: str, expected_arguments):
        result, arguments = execute_workflow_script(path, version)
        self.assertEqual(0, result.returncode, result.stderr)
        self.assertEqual(expected_arguments, arguments)

    def assert_rejected(self, path: Path, version: str):
        result, arguments = execute_workflow_script(path, version)
        self.assertNotEqual(0, result.returncode)
        self.assertIsNone(arguments, "Gradle must not run for an invalid VERSION")
        message = result.stdout + result.stderr
        self.assertIn("VERSION", message)
        self.assertIn("-SNAPSHOT", message)

    def test_snapshot_accepts_empty_version_for_build_default(self):
        self.assert_accepted(SNAPSHOT_WORKFLOW, "", SNAPSHOT_GRADLE_ARGUMENTS)

    def test_snapshot_accepts_snapshot_suffix(self):
        self.assert_accepted(
            SNAPSHOT_WORKFLOW,
            "v29.1.0-SNAPSHOT",
            SNAPSHOT_GRADLE_ARGUMENTS,
        )

    def test_snapshot_rejects_non_snapshot_suffix(self):
        self.assert_rejected(SNAPSHOT_WORKFLOW, "v29.1.0")

    def test_release_accepts_non_snapshot_version(self):
        self.assert_accepted(RELEASE_WORKFLOW, "v29.1.0", RELEASE_GRADLE_ARGUMENTS)

    def test_release_rejects_empty_version(self):
        self.assert_rejected(RELEASE_WORKFLOW, "")

    def test_release_rejects_snapshot_suffix(self):
        self.assert_rejected(RELEASE_WORKFLOW, "v29.1.0-SNAPSHOT")

    def test_obsolete_snapshot_environment_is_absent(self):
        for path in (SNAPSHOT_WORKFLOW, RELEASE_WORKFLOW):
            text = path.read_text()
            self.assertIsNone(re.search(r"(?m)^\s+SNAPSHOT:\s*", text), path)

    def test_obsolete_publishing_helper_is_absent(self):
        helper = ROOT / "buildSrc/src/main/kotlin/publish.kt"
        self.assertFalse(helper.exists(), helper)

    def test_workflow_contracts_remain_unchanged(self):
        snapshot = SNAPSHOT_WORKFLOW.read_text()
        release = RELEASE_WORKFLOW.read_text()
        self.assertIn("workflow_dispatch:", snapshot)
        self.assertIn("release:", release)
        self.assertIn("types: [created]", release)
        for text in (snapshot, release):
            self.assertEqual(1, text.count("./gradlew"))
            for mapping in SECRET_MAPPINGS:
                self.assertEqual(1, text.count(mapping), mapping)
            self.assertNotIn("automaticRelease", text)


if __name__ == "__main__":
    unittest.main()
