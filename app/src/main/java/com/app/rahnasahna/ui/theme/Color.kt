package com.app.rahnasahna.ui.theme

import androidx.compose.material.Colors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

val Purple200 = Color(0xFFBB86FC)
val Purple500 = Color(0xFF6200EE)
val Purple700 = Color(0xFF3700B3)
val Teal200 = Color(0xFF03DAC5)

val Green500 = Color(0xFF1DBF73)
val Green700 = Color(0xFF13804D)
val Gray700 = Color(0xFFC4C4C4)
val Gray200 = Color(0xFFF4F4F4)

val Colors.buttonBackground: Color
@Composable
get() = if(isLight) Green700 else Green700
