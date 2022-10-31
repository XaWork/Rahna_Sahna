package com.app.rahnasahna.ui.componenet

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.app.rahnasahna.R
import com.app.rahnasahna.ui.theme.CardCornerRadius
import com.app.rahnasahna.ui.theme.CardElevation
import com.app.rahnasahna.ui.theme.MediumPadding

@Composable
fun SingleWishlist() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .background(shape = RoundedCornerShape(CardCornerRadius), color = Color.White),
        elevation = CardElevation
    ) {
        Column {
            Image(
                painter = painterResource(id = R.drawable.cancel),
                contentDescription = ""
            )
        }
    }
}

@Preview
@Composable
fun SingleWishlistPreview() {
    SingleWishlist()
}