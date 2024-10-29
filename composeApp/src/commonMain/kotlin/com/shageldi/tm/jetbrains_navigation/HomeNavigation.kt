package com.shageldi.tm.jetbrains_navigation

import androidx.compose.foundation.clickable
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun HomeNavigation(navHostController: NavHostController = rememberNavController()) {
    NavHost(navHostController, startDestination = Routes.HOME) {
        composable(route = Routes.HOME) {
            Button(
                onClick = {
                    navHostController.navigate(Routes.DETAILS)
                }
            ) {
                Text("Go details")
            }
        }

        composable(route = Routes.DETAILS) {
            Text("<- Details Screen", modifier = Modifier.clickable {
                navHostController.navigateUp()
            })
        }
    }
}