package com.app.rahnasahna.ui.componenet

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.app.rahnasahna.R
import com.app.rahnasahna.ui.theme.LowSpacing
import com.app.rahnasahna.ui.theme.SocialIconSize

@Composable
fun SingleOtherLoginOption(
    icon: Int,
    contentDescription: String = "",
    title: String
) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            modifier = Modifier.size(SocialIconSize),
            painter = painterResource(id = icon),
            contentDescription = contentDescription
        )

        Spacer(modifier = Modifier.height(LowSpacing))

        Text(text = title, color = Color.Black, fontSize = 14.sp, fontWeight = FontWeight.Normal)
    }
}

@Preview
@Composable
fun SingleOtherLoginOptionPreview() {
    SingleOtherLoginOption(icon = R.drawable.facebook, title = "Facebook")
}