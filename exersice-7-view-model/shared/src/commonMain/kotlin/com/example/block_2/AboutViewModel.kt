package com.example.block_2

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class AboutViewModel : ViewModel() {

    private val _platformInfo = MutableStateFlow(getPlatformInfo())
    val platformInfo: StateFlow<PlatformInfo> = _platformInfo.asStateFlow()
}
