package com.shageldi.tm

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import com.shageldi.tm.jetbrains_navigation.JetbrainsNavigation
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    MaterialTheme {
        JetbrainsNavigation()
    }
}