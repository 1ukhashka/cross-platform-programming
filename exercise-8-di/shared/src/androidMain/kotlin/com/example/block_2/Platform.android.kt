package com.example.block_2

import android.os.Build

actual fun getPlatformInfo(): PlatformInfo = PlatformInfo(
    name = "${Build.MANUFACTURER} ${Build.MODEL}",
    version = "Android ${Build.VERSION.RELEASE} (API ${Build.VERSION.SDK_INT})",
    osFamily = "Android"
)
