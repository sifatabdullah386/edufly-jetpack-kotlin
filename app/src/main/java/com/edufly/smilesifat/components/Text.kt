package com.edufly.smilesifat.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import com.edufly.smilesifat.theme.EduFlyTheme
import com.edufly.smilesifat.theme.colorBLack

@Composable
fun TextUI(
    text: String,
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
        fontSize = fontSize,
        textAlign = textAlign,
        lineHeight = lineHeight,
        maxLines = maxLines
    )
}

@Preview(showBackground = true, showSystemUi = false)
@Composable
fun GreetingPreview() {
    EduFlyTheme {
        TextUI("Demo", colorBLack, 16.sp)
    }
}

