package io.ygdrasil.wgpu

fun UInt.toBoolean() = this > 0u
fun Boolean.toUInt() = if (this) 1u else 0u

fun Int.toBoolean() = this > 0
fun Boolean.toInt() = if (this) 1 else 0