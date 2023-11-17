package com.edufly.smilesifat.components

import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.Color
import com.google.accompanist.systemuicontroller.rememberSystemUiController

@Composable
fun SetStatusBarColor(color: Color) {
    val systemUiController = rememberSystemUiController()

    SideEffect {
        systemUiController.setSystemBarsColor(color)
    }

//    if(darkTheme){
//        systemUiController.setSystemBarsColor(
//            color = Color.Transparent
//        )
//    }else{
//        systemUiController.setSystemBarsColor(
//            color = Color.White
//        )
//    }
}