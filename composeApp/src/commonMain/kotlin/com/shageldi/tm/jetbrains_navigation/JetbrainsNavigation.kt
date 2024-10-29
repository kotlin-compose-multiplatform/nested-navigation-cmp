package com.shageldi.tm.jetbrains_navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

class Routes {
    companion object {
        const val HOME = "home"
        const val DETAILS = "details"
        const val PROFILE = "profile"
    }
}

@Composable
fun JetbrainsNavigation(modifier: Modifier = Modifier) {
    val navController = rememberNavController()
    val homeNavController = rememberNavController()
    val profileNavController = rememberNavController()

    Scaffold(
        bottomBar = {
            NavigationBar {
                NavigationBarItem(
                    selected = true,
                    icon = {
                        Icon(Icons.Default.Home, contentDescription = "home")
                    },
                    label = {
                        Text("HOME")
                    },
                    onClick = {
                        navController.navigate(Routes.HOME) {
                            navController.graph.startDestinationRoute?.let { route ->
                                popUpTo(route) {
                                    saveState = true
                                }
                            }
                            launchSingleTop = true
                            restoreState = true

                        }
                    }
                )
                NavigationBarItem(
                    selected = true,
                    icon = {
                        Icon(Icons.Default.Person, contentDescription = "profile")
                    },
                    label = {
                        Text("PROFILE")
                    },
                    onClick = {
                        navController.navigate(Routes.PROFILE) {
                            navController.graph.startDestinationRoute?.let { route ->
                                popUpTo(route) {
                                    saveState = true
                                }
                            }
                            launchSingleTop = true
                            restoreState = true

                        }
                    }
                )
            }
        }
    ) {
        NavHost(navController = navController, startDestination = Routes.HOME) {
            composable(Routes.HOME) {
                HomeNavigation(homeNavController)
            }
            composable(Routes.PROFILE) {
                HomeNavigation(profileNavController)
            }
        }
    }
}