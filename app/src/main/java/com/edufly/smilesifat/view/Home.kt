package com.edufly.smilesifat.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.edufly.smilesifat.components.CardViewCourses
import com.edufly.smilesifat.components.TabLayout
import com.edufly.smilesifat.theme.EduFlyTheme
import com.edufly.smilesifat.theme.colorBLack
import com.edufly.smilesifat.theme.colorBackground
import com.edufly.smilesifat.theme.colorPrimary
import com.edufly.smilesifat.viewmodel.CoursesViewModel
import com.example.edufly.R

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun Home() {
    EduFlyTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = colorBackground
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .verticalScroll(rememberScrollState())
                    .padding(start = 15.dp, end = 15.dp)
                    .background(color = colorBackground),
//                horizontalAlignment = Alignment.CenterHorizontally,
//                verticalArrangement = Arrangement.Center
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 10.dp, bottom = 5.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.ic_menu_right),
                        contentDescription = "image description",
                        contentScale = ContentScale.None
                    )
                    Image(
                        painter = painterResource(id = R.drawable.no_image_found),
                        contentDescription = "image description",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(32.dp)
                            .clip(CircleShape)
//                            .clip(RoundedCornerShape(percent = 50))
                            .border(1.dp, Color.Gray, CircleShape)
                    )
                }
//                Text(
//                    "Home Screen",
//                    style = MaterialTheme.typography.titleLarge,
//                    modifier = Modifier.padding(vertical = 20.dp)
//                )
                Text(
                    text = "Welcome, Mark",
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontFamily = FontFamily(Font(R.font.poppins_bold)),
                        fontWeight = FontWeight(400),
                        color = colorBLack,
                    )
                )
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 10.dp, bottom = 5.dp),
                    text = "Explore Most Popular\nCourses with us. ",
                    style = TextStyle(
                        fontSize = 26.sp,
                        fontFamily = FontFamily(Font(R.font.poppins_bold)),
                        fontWeight = FontWeight(700),
                        color = colorBLack,
                    )
                )

                var text by remember { mutableStateOf(TextFieldValue("")) }

                OutlinedTextField(
                    value = text,
//                    leadingIcon = {
//                        Icon(
//                            imageVector = Icons.Default.Email,
//                            contentDescription = null
//                        )
//                    },
                    trailingIcon = {
                        Icon(
                            imageVector = Icons.Default.Search,
                            contentDescription = null
                        )
                    },
                    modifier = Modifier
                        .padding(top = 10.dp)
                        .fillMaxWidth(),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
//                    label = { Text(text = "Search Anything Here") },
                    placeholder = {
                        Text(
                            text = "Search anything here",
                            fontFamily = FontFamily(Font(R.font.poppins_medium)),
                        )
                    },
                    onValueChange = {
                        text = it
                    }
                )

                TabLayout()

                Row(
                    modifier = Modifier
                        .padding(top = 20.dp)
                        .wrapContentHeight()
                        .fillMaxWidth()
                ) {
//                    RecentlyOpenedCardView()
                }

                Row(modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp, bottom = 10.dp),
                    horizontalArrangement = Arrangement.SpaceBetween) {
                    Text(
                        modifier = Modifier
                            .wrapContentWidth(),
                        text = "Popular Courses",
                        style = TextStyle(
                            fontSize = 16.sp,
                            fontFamily = FontFamily(Font(R.font.poppins_bold)),
                            fontWeight = FontWeight(600),
                            color = colorBLack,
                        )
                    )
                    Text(
                        modifier = Modifier
                            .wrapContentWidth(),
                        text = "View All",
                        style = TextStyle(
                            fontSize = 16.sp,
                            fontFamily = FontFamily(Font(R.font.poppins_bold)),
                            fontWeight = FontWeight(600),
                            color = colorPrimary
                        )
                    )
                }


                val coursesItems = CoursesViewModel()
                var selectedItemIndex by rememberSaveable { mutableIntStateOf(0) }

                LazyRow(
                    horizontalArrangement = Arrangement.spacedBy(space = 12.dp),
                ) {
                    items(coursesItems.size) { index ->
                        CardViewCourses(coursesItems[index])
                    }
                }
            }
        }
    }
}