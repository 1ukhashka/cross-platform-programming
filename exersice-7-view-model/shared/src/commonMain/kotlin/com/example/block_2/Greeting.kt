package com.example.block_2

class Greeting {
    private val platformInfo = getPlatformInfo()

    fun greet(): String {
        return "Hello from ${platformInfo.name}!"
    }
}