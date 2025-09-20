package com.example.myapplication.project

import androidx.compose.ui.graphics.LightingColorFilter
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.myapplication.R

object GStyles {
    val gMarkt = FontFamily(
        Font(R.font.g_market_bold, weight = FontWeight.Bold),
        Font(R.font.g_market_medium, weight = FontWeight.Medium),
        Font(R.font.g_market_light, weight = FontWeight.Light)
    )

    val Bold = androidx.compose.ui.text.TextStyle(
        fontFamily = gMarkt,
        letterSpacing = (-0.2).sp,
        fontWeight = FontWeight.Bold
    )

    val Medium = androidx.compose.ui.text.TextStyle(
        fontFamily = gMarkt,
        letterSpacing = (-0.2).sp,
        fontWeight = FontWeight.Medium
    )

    val Light = androidx.compose.ui.text.TextStyle(
        fontFamily = gMarkt,
        letterSpacing = (-0.2).sp,
        fontWeight = FontWeight.Light
    )
}