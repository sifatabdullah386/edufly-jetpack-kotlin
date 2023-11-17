package com.edufly.smilesifat.model

import androidx.compose.ui.graphics.Color

data class CoursesItems(
    val isFav: Int,
    val img: Int,
    val backColor: Color,
    val subHeading: String,
    val subColor: Color,
    val heading: String,
    val reviews: String,
    val rate: String,
    val price: String,
)