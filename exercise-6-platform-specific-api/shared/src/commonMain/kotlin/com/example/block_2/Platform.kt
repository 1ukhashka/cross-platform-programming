package com.example.block_2

data class PlatformInfo(
    val name: String,
    val version: String,
    val osFamily: String
)

expect fun getPlatformInfo(): PlatformInfo
