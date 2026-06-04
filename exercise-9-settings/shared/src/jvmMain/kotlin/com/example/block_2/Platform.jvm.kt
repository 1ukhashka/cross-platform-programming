package com.example.block_2

actual fun getPlatformInfo(): PlatformInfo = PlatformInfo(
    name = System.getProperty("os.name") ?: "Unknown",
    version = System.getProperty("os.version") ?: "Unknown",
    osFamily = "Desktop (JVM)"
)
