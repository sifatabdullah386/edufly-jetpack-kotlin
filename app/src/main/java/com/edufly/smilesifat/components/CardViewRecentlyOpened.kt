package com.edufly.smilesifat.components

import android.content.Context
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.edufly.smilesifat.model.CoursesItems
import com.edufly.smilesifat.theme.colorPrimary
import com.edufly.smilesifat.theme.colorWhite
import com.example.edufly.R


@Composable
fun CardViewRecentlyOpened(coursesItems: CoursesItems,
                           context: Context = LocalContext.current.applicationContext
) {
    Card(
        modifier = Modifier
            .height(270.dp)
            .width(180.dp)
            .fillMaxWidth()
            .padding(end = 7.dp),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 0.dp
        ),
        shape = RoundedCornerShape(size = 10.dp),
        colors = CardDefaults.cardColors(
            containerColor = coursesItems.backColor,
        ),
    ) {
        Column() {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight(),
                horizontalArrangement = Arrangement.End
            ) {
                Image(
                    modifier = Modifier
                        .wrapContentWidth()
                        .wrapContentHeight()
                        .padding(all = 8.dp),
                    alignment = Alignment.Center,
                    painter = painterResource(coursesItems.isFav),
                    contentDescription = null,
                    contentScale = ContentScale.Crop
                )
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight(),
                horizontalArrangement = Arrangement.Center
            ) {
                Image(
                    modifier = Modifier
                        .height(90.dp)
                        .width(90.dp),
                    painter = painterResource(coursesItems.img),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    alignment = Alignment.Center
                )
            }
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp)
                .padding(top = 15.dp, bottom = 0.dp)
                .background(coursesItems.subColor),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                modifier = Modifier.padding(start = 7.dp),
                text = coursesItems.subHeading,
                fontSize = 10.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black,
                maxLines = 2
            )
        }
        Column(
            modifier = Modifier
                .fillMaxHeight()
                .background(Color.White)
        ) {
            Text(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 5.dp, top = 5.dp),
                text = coursesItems.heading,
                style = TextStyle(
                    fontSize = 12.sp,
//                    fontFamily = FontFamily(Font(R.font.open sans)),
                    fontWeight = FontWeight(600),
                    color = Color(0xFF000000),
                ),
                maxLines = 1
            )
            Row(
                modifier = Modifier
                    .wrapContentWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    modifier = Modifier
                        .wrapContentWidth()
                        .padding(start = 5.dp),
                    text = coursesItems.reviews,
                    style = TextStyle(
                        fontSize = 10.sp,
//                    fontFamily = FontFamily(Font(R.font.open sans)),
                        fontWeight = FontWeight(400),
                        color = Color(0xFF000000),
                    ),
                    maxLines = 1
                )
                Image(
                    modifier = Modifier
                        .wrapContentWidth()
                        .padding(start = 5.dp, end = 3.dp),
                    painter = painterResource(id = R.drawable.baseline_star_rate_24),
                    contentDescription = "image description",
                    contentScale = ContentScale.None
                )
                Text(
                    text = coursesItems.rate,
                    style = TextStyle(
                        fontSize = 10.sp,
//                        fontFamily = FontFamily(Font(R.font.open sans)),
                        fontWeight = FontWeight(400),
                        color = Color(0xFF000000),
                    )
                )
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(end = 5.dp),
                    text = coursesItems.price,
                    style = TextStyle(
                        fontSize = 14.sp,
//                        fontFamily = FontFamily(Font(R.font.open sans)),
                        fontWeight = FontWeight(600),
                        color = Color(0xFF000000),
                        textAlign = TextAlign.End
                    ),
                )
            }

            Text(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(32.dp)
                    .padding(15.dp, 15.dp, 10.dp)
                    .background(colorPrimary, RoundedCornerShape(size = 10.dp)),
                text = "Enroll Now",
                style = TextStyle(
                    fontSize = 12.sp,
//                        fontFamily = FontFamily(Font(R.font.open sans)),
                    fontWeight = FontWeight(600),
                    color = colorWhite,
                    textAlign = TextAlign.Center
                ),
            )
        }
    }
}
