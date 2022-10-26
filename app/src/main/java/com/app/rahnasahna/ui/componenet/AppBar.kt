package com.app.rahnasahna.ui.componenet

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.app.rahnasahna.R
import com.app.rahnasahna.ui.theme.AppBarHeight
import com.app.rahnasahna.ui.theme.Green500
import com.app.rahnasahna.ui.theme.HighPadding
import com.app.rahnasahna.ui.theme.LowPadding

@Composable
fun AppBar(
    title: String,
    onClick: () -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = Green500)
            .padding(HighPadding),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = R.drawable.back_button),
            contentDescription = "back button",
            modifier = Modifier
                .clickable { onClick() })

        Spacer(modifier = Modifier.width(20.dp))

        Text(text = title, fontSize = 16.sp, color = Color.White, fontWeight = FontWeight.Normal)
    }
}

@Preview
@Composable
fun AppBarPreview() {
    AppBar(title = "Notification") {

    }
}