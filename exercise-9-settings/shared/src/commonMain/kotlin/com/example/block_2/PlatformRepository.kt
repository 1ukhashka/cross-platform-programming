package com.example.block_2

import com.russhwolf.settings.Settings
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class PlatformRepository(private val settings: Settings) {

    companion object {
        private const val KEY_OPEN_COUNT = "open_count"
        private const val KEY_LAST_OPENED = "last_opened"
    }

    fun getPlatform(): PlatformInfo = getPlatformInfo()

    fun incrementOpenCount() {
        val current = settings.getInt(KEY_OPEN_COUNT, 0)
        settings.putInt(KEY_OPEN_COUNT, current + 1)
    }

    fun getOpenCount(): Int = settings.getInt(KEY_OPEN_COUNT, 0)

    fun updateLastOpened() {
        val now = LocalDateTime.now()
        val formatted = now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"))
        settings.putString(KEY_LAST_OPENED, formatted)
    }

    fun getLastOpened(): String = settings.getString(KEY_LAST_OPENED, "Never")
}
