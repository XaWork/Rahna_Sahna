package com.app.rahnasahna.ui.componenet

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.app.rahnasahna.ui.theme.Gray700
import com.app.rahnasahna.ui.theme.LowCornerRadius

@Composable
fun SingleNotification() {
    Surface(modifier = Modifier
        .fillMaxWidth()
        .background(color = Gray700, shape = RoundedCornerShape(LowCornerRadius))
    ) {
        
    }
}