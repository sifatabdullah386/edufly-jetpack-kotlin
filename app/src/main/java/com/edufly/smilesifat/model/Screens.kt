package com.edufly.smilesifat.model

sealed class Screens(val route: String) {
    object Home : Screens(route = "Home")
    object Offer : Screens(route = "Offer")
    object Chat : Screens(route = "Chat")
    object More : Screens(route = "More")
}