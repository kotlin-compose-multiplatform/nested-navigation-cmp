package com.shageldi.tm

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Nested Navigation CMP",
    ) {
        App()
    }
}