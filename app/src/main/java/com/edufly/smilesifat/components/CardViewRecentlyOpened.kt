package com.edufly.smilesifat.components

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Favorite
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun CardViewRecentlyOpened() {
    val optionsList = prepareOptionsList()
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(space = 12.dp),
        contentPadding = PaddingValues(horizontal = 8.dp, vertical = 12.dp)
    ) {
        items(optionsList.size) { item ->
            optionsList.forEachIndexed { index, item ->
                ItemLayout(optionsList = item)
            }
        }
    }
}

// single item layout
@Composable
private fun ItemLayout(
    optionsList: OptionsList,
    context: Context = LocalContext.current.applicationContext
) {
    Card(
        shape = RoundedCornerShape(size = 12.dp),
        // if you are using Material 2, change the following to elevation = 4.dp
        elevation = CardDefaults.cardElevation(
            defaultElevation = 4.dp
        )
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .clickable {
                    Toast
                        .makeText(context, optionsList.option, Toast.LENGTH_SHORT)
                        .show()
                }
                .padding(all = 8.dp),
        ) {
            Icon(
                modifier = Modifier.size(size = 36.dp),
                imageVector = optionsList.icon,
                contentDescription = null,
                tint = Color(0xFF7850E8)
            )
        }
    }
}

// add items to the list
private fun prepareOptionsList(): MutableList<OptionsList> {
    val optionsList = mutableListOf<OptionsList>()

    optionsList.add(OptionsList(icon = Icons.Outlined.Favorite, option = "Saved Items"))
    optionsList.add(
        OptionsList(
            icon = Icons.Outlined.Notifications,
            option = "Previous Notifications"
        )
    )

    return optionsList
}

data class OptionsList(val icon: ImageVector, val option: String)