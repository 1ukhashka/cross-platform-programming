package com.example.block_2

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class AboutViewModel(
    private val repository: PlatformRepository
) : ViewModel() {

    private val _platformInfo = MutableStateFlow(repository.getPlatform())
    val platformInfo: StateFlow<PlatformInfo> = _platformInfo.asStateFlow()

    private val _openCount = MutableStateFlow(0)
    val openCount: StateFlow<Int> = _openCount.asStateFlow()

    private val _lastOpened = MutableStateFlow("")
    val lastOpened: StateFlow<String> = _lastOpened.asStateFlow()

    init {
        repository.incrementOpenCount()
        repository.updateLastOpened()
        _openCount.value = repository.getOpenCount()
        _lastOpened.value = repository.getLastOpened()
    }
}
