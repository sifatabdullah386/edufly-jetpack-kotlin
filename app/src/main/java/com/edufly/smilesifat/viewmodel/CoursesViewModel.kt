package com.edufly.smilesifat.viewmodel

import com.edufly.smilesifat.model.CoursesItems
import com.edufly.smilesifat.theme.colorYellow
import com.edufly.smilesifat.theme.colorYellowDark
import com.example.edufly.R

fun CoursesViewModel(): MutableList<CoursesItems> {
    val courseList = mutableListOf<CoursesItems>()

    courseList.add(CoursesItems(isFav = R.drawable.baseline_favorite_24,
        img = R.drawable.ic_chemistry,
        backColor = colorYellow,
        subHeading = "",
        subColor = colorYellowDark,
        heading = "",
        reviews = "",
        rate = "",
        price = ""))
    courseList.add(CoursesItems(isFav = R.drawable.baseline_favorite_24,
        img = R.drawable.ic_chemistry,
        backColor = colorYellow,
        subHeading = "",
        subColor = colorYellowDark,
        heading = "",
        reviews = "",
        rate = "",
        price = ""))

    return courseList
}