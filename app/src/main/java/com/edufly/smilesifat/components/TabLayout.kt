package com.edufly.smilesifat.components

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.ScrollableTabRow
import androidx.compose.material3.Tab
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.edufly.smilesifat.model.TabItem
import com.edufly.smilesifat.theme.colorBLack
import com.edufly.smilesifat.theme.colorBackground

@Preview
@Composable
fun TabLayout() {
    val tabItems = listOf(
        TabItem(
            title = "All Courses"
        ),
        TabItem(
            title = "Science"
        ),
        TabItem(
            title = "Commerce"
        ),
        TabItem(
            title = "Arts"
        ),
        TabItem(
            title = "CSE"
        ),
        TabItem(
            title = "EEE"
        ),
        TabItem(
            title = "ME"
        ),
        TabItem(
            title = "Robotics"
        ),
        TabItem(
            title = "ECE"
        ),
        TabItem(
            title = "ES"
        ),
    )

    var selectedTabIndex by rememberSaveable { mutableIntStateOf(0) }

    ScrollableTabRow(
        containerColor = colorBackground,
        selectedTabIndex = selectedTabIndex, divider = {
            Spacer(modifier = Modifier.height(0.dp))
        },
//        indicator = {
//            TabRowDefaults.Indicator(
//                color = colorBLack,
//                height = 2.dp
//            )
//        },
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .wrapContentWidth()
            .padding(top = 10.dp)
    ) {

        // tab items
        tabItems.forEachIndexed { index, item ->
            Tab(
                selected = (index == selectedTabIndex),
                onClick = {
                    selectedTabIndex = index
                },
                text = {
                    Text(
                        text = item.title, style = TextStyle(
                            fontSize = 14.sp,
//                        fontFamily = FontFamily(Font(R.font.open sans)),
                            fontWeight = FontWeight(600),
                            color = colorBLack,
                        )
                    )
                },
//                icon = {
//                    Icon(
//                        imageVector = if (index == selectedTabIndex) item.selectedIcon else item.unselectedIcon,
//                        contentDescription = null
//                    )
//                }
            )
        }
    }
}