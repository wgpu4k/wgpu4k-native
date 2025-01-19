package io.ygdrasil.wgpu

import ffi.memoryScope
import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe

class SimpleTest : FreeSpec ({

    "simple mapping test" {

        memoryScope {scope ->
            val info = WGPUAdapterInfo.allocate(scope)

            info.deviceID = 51u

            info.deviceID shouldBe 51u
        }
    }
})