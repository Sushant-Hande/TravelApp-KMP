package example.travelapp_kmp

import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.WindowPosition
import androidx.compose.ui.window.WindowState
import androidx.compose.ui.window.application
import com.example.travelapp_kmp.AppViewDesktop

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "TravelApp-KMP",
        state = WindowState(
            position = WindowPosition.Aligned(Alignment.Center),
            size = DpSize(Dp(1000f), Dp(1500f))
        ),
    ) {
        AppViewDesktop()
    }
}
