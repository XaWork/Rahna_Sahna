package com.app.rahnasahna.ui.componenet

import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import coil.decode.SvgDecoder
import coil.request.ImageRequest
import com.app.rahnasahna.R
import com.app.rahnasahna.ui.theme.*

@Composable
fun SingleNotification() {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight(align = Alignment.CenterVertically)
                .background(color = Gray200, shape = RoundedCornerShape(LowCornerRadius))
                .padding(vertical = HighPadding, horizontal = MediumPadding),
            verticalAlignment = Alignment.CenterVertically
        ) {
            AsyncImage(
                model = ImageRequest.Builder(LocalContext.current)
                    .decoderFactory(SvgDecoder.Factory())
                    .data("")
                    .build(),
                contentDescription = "",
                placeholder = painterResource(id = R.drawable.dummy_room),
                error = painterResource(id = R.drawable.image_error),
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(NotificationCircleImageSize)
                    .clip(CircleShape)
            )

            Spacer(modifier = Modifier.width(HighSpacing))

            Column(
                modifier = Modifier.fillMaxWidth(1f),
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "Most Expensive Rooms",
                    fontWeight = FontWeight.Normal,
                    fontSize = 16.sp,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )

                Spacer(modifier = Modifier.height(LowSpacing))

                Text(
                    text = "Rooms that you have to check once!",
                    fontWeight = FontWeight.Light,
                    fontSize = 14.sp,
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis
                )
            }
        }
}

@Preview
@Composable
fun SingleNotificationPreview() {
    SingleNotification()
}