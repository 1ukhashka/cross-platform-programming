package com.example.task_00

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform