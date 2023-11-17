package com.edufly.smilesifat.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import com.edufly.smilesifat.theme.colorPrimary

@Composable
fun Button(text: String,
           color: Color,
//    modifier: Modifier = Modifier,
           fontSize: TextUnit = TextUnit.Unspecified,
           textAlign: TextAlign? = null,
           lineHeight: TextUnit = TextUnit.Unspecified,
           maxLines: Int = Int.MAX_VALUE
) {
    Text(
        text = text,
        color = color,
//        modifier=modifier,
        modifier = Modifier
            .background(
                color = colorPrimary,
                shape = RoundedCornerShape(size = 26.dp)
            )
            .padding(all=8.dp),
        fontSize = fontSize,
        textAlign = textAlign,
        lineHeight = lineHeight,
        maxLines = maxLines
    )
}