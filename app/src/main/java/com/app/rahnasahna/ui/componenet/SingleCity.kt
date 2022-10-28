package com.app.rahnasahna.ui.componenet

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.app.rahnasahna.R
import com.app.rahnasahna.ui.theme.SingleCitySize
import com.app.rahnasahna.ui.theme.SpaceBetweenViewsAndSubViews

@Composable
fun SingleCity(
    icon: Int,
    imageUrl: String = "",
    title: String,
) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = icon),
            contentDescription = title,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(SingleCitySize)
                .clip(CircleShape)
        )

        Spacer(modifier = Modifier.height(SpaceBetweenViewsAndSubViews))

        Text(text = title, fontSize = 14.sp, fontWeight = FontWeight.Light, color = Color.Black)
    }
}

@Preview
@Composable
fun SingleCityPreview() {
    SingleCity(icon = R.drawable.facebook, title = "Nearby")
}