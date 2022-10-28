package com.app.rahnasahna.ui.componenet

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.app.rahnasahna.R
import com.app.rahnasahna.ui.theme.*

@Composable
fun SingleRoom() {
    Column(
        modifier = Modifier
            .padding(LowPadding)
            .background(Color.White)
            .fillMaxWidth()
    ) {
        Image(
            painter = painterResource(id = R.drawable.dummy_room),
            contentDescription = "",
            modifier = Modifier
                .fillMaxWidth()
                .clip(
                    RoundedCornerShape(LowCornerRadius)
                )
        )

        Spacer(modifier = Modifier.height(MediumSpacing))

        Text(
            text = "Single Room with kitchen",
            overflow = TextOverflow.Ellipsis,
            fontSize = 16.sp,
            color = Color.Black,
            fontWeight = FontWeight.Bold,
        )

        Spacer(modifier = Modifier.height(LowSpacing))

        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.location),
                contentDescription = "",
                modifier = Modifier.size(12.dp)
            )

            Spacer(modifier = Modifier.width(LowSpacing))

            Text(
                text = "Kissan colony, Jhunjhunu",
                fontSize = 12.sp,
                fontWeight = FontWeight.Light,
                overflow = TextOverflow.Ellipsis,
                maxLines = 2,
            )
        }

        Spacer(modifier = Modifier.height(LowSpacing))

        Box(contentAlignment = Alignment.Center) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.star),
                    contentDescription = "",
                    modifier = Modifier.size(12.dp)
                )
                Spacer(modifier = Modifier.width(LowSpacing))
                Text(
                    text = "0(0)",
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Light,
                    overflow = TextOverflow.Ellipsis,
                    maxLines = 2,
                )
            }

            Text(
                text = "Rs. 2000/month",
                fontWeight = FontWeight.Bold,
                color = Color.Black,
                fontSize = 12.sp
            )
        }

        Spacer(modifier = Modifier.height(MediumSpacing))

        Box(
            modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            Row {
                Row(
                    modifier = Modifier
                        .weight(1f)
                        .background(color = Gray700, shape = RoundedCornerShape(LowCornerRadius))
                        .padding(vertical = LowPadding),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.people),
                        contentDescription = ""
                    )
                    Spacer(modifier = Modifier.width(LowSpacing))
                    Text(text = "2", color = Color.Black, fontWeight = FontWeight.Light)
                }

                Spacer(modifier = Modifier.width(MediumSpacing))

                Row(
                    modifier = Modifier
                        .weight(1f)
                        .background(color = Gray700, shape = RoundedCornerShape(LowCornerRadius))
                        .padding(LowPadding),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.bed),
                        contentDescription = ""
                    )
                    Spacer(modifier = Modifier.width(LowSpacing))
                    Text(text = "Family", color = Color.Black, fontWeight = FontWeight.Light)
                }

                Spacer(modifier = Modifier.width(MediumSpacing))

                Row(
                    modifier = Modifier
                        .weight(1f)
                        .background(color = Gray700, shape = RoundedCornerShape(LowCornerRadius))
                        .padding(LowPadding),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.person),
                        contentDescription = ""
                    )
                    Spacer(modifier = Modifier.width(LowSpacing))
                    Text(text = "Boys", color = Color.Black, fontWeight = FontWeight.Light)
                }
            }
        }
    }
}

@Preview
@Composable
fun SingleRoomPreview() {
    SingleRoom()
}