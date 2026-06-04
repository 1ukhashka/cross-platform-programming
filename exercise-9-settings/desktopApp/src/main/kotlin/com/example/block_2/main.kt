import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.example.block_2.App
import com.example.block_2.appModule
import org.koin.core.context.startKoin

fun main() {
    startKoin {
        modules(appModule)
    }

    application {
        Window(
            onCloseRequest = ::exitApplication,
            title = "Block 2",
        ) {
            App()
        }
    }
}
