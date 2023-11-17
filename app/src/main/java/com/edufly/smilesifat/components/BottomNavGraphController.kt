package com.edufly.smilesifat.components

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.edufly.smilesifat.model.Screens
import com.edufly.smilesifat.view.Chat
import com.edufly.smilesifat.view.Home
import com.edufly.smilesifat.view.More
import com.edufly.smilesifat.view.Offer

@Composable
fun SetupNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screens.Home.route
    ) {
        composable(
            route = Screens.Home.route
        ) {
            Home()
        }

        composable(
            route = Screens.Offer.route
        ) {
            Offer()
        }

        composable(
            route = Screens.Chat.route
        ) {
            Chat()
        }
        composable(
            route = Screens.More.route
        ) {
            More()
        }
    }
}