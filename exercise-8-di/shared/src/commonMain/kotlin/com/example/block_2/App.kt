package com.example.block_2

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import co.touchlab.kermit.Logger
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun App() {
    AppTheme {
        val viewModel: AboutViewModel = koinViewModel()
        val platformInfo by viewModel.platformInfo.collectAsState()

        LaunchedEffect(Unit) {
            Logger.d("App") { "App started on: ${platformInfo.name}" }
            Logger.i("App") { "OS: ${platformInfo.osFamily}, version: ${platformInfo.version}" }
        }

        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(24.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "System Info",
                    style = MaterialTheme.typography.headlineLarge,
                    color = MaterialTheme.colorScheme.primary
                )

                Spacer(modifier = Modifier.height(32.dp))

                InfoCard(label = "Platform", value = platformInfo.osFamily)
                Spacer(modifier = Modifier.height(12.dp))
                InfoCard(label = "Device / OS", value = platformInfo.name)
                Spacer(modifier = Modifier.height(12.dp))
                InfoCard(label = "Version", value = platformInfo.version)
            }
        }
    }
}

@Composable
private fun InfoCard(label: String, value: String) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surface
        ),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(
                text = label,
                style = MaterialTheme.typography.labelLarge,
                color = MaterialTheme.colorScheme.secondary
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = value,
                style = MaterialTheme.typography.bodyLarge,
                color = MaterialTheme.colorScheme.onSurface
            )
        }
    }
}
