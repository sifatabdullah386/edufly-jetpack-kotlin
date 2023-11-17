package com.edufly.smilesifat.view

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.edufly.smilesifat.components.NavBar
import com.edufly.smilesifat.components.SetStatusBarColor
import com.edufly.smilesifat.theme.EduFlyTheme
import com.edufly.smilesifat.theme.colorBackground

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EduFlyTheme {
                LoadSurface()
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun LoadSurface() {
    SetStatusBarColor(color = colorBackground)
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        NavBar()
    }
}