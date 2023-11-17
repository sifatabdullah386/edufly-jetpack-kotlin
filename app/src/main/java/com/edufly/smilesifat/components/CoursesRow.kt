package com.edufly.smilesifat.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.unit.dp
import com.edufly.smilesifat.viewmodel.CoursesViewModel

@Composable
fun CoursesRow() {
    val coursesItems = CoursesViewModel()
    var selectedItemIndex by rememberSaveable { mutableIntStateOf(0) }

    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(space = 12.dp),
//        contentPadding = PaddingValues(horizontal = 8.dp, vertical = 12.dp)
    ) {
        items(coursesItems.size) { item ->
            coursesItems.forEachIndexed { index, item ->
                CardViewCourses(coursesItems = item)
            }
        }
    }
}