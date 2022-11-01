package com.app.rahnasahna.ui.componenet

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.LocalTextStyle
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.app.rahnasahna.R
import com.app.rahnasahna.ui.theme.*

@Composable
fun SingleWishlist() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .background(shape = RoundedCornerShape(CardCornerRadius), color = Color.White),
        elevation = CardElevation
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(MediumPadding)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.End
            ) {
                Image(
                    painter = painterResource(id = R.drawable.cancel),
                    contentDescription = "",
                )
            }

            Row(modifier = Modifier.fillMaxWidth()) {
                AsyncImage(
                    model = ImageRequest.Builder(LocalContext.current)
                        .data("")
                        .build(),
                    contentDescription = "",
                    placeholder = painterResource(id = R.drawable.image_placeholder),
                    error = painterResource(id = R.drawable.image_error),
                    modifier = Modifier
                        .size(WishlistRoundImageSize)
                        .clip(RoundedCornerShape(MediumCornerRadius))
                )

                Spacer(modifier = Modifier.width(SpaceBetweenViewsAndSubViews))

                Column(modifier = Modifier.fillMaxWidth(1f)) {
                    Text(
                        text = "Single Room in Jhunjhunu",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )

                    //Spacer(modifier = Modifier.height(SpaceBetweenViewsAndSubViews))

                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Image(
                            painter = painterResource(id = R.drawable.location),
                            contentDescription = "location"
                        )
                        //Spacer(modifier = Modifier.width(SpaceBetweenViewsAndSubViews))
                        Text(
                            text = "Kissan colony, Jhunjhunu, Rajasthan, Pin - 333001, India",
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Normal,
                            maxLines = 2,
                            overflow = TextOverflow.Ellipsis
                        )
                    }

                    //Spacer(modifier = Modifier.height(SpaceBetweenViewsAndSubViews))

                    Text(
                        text = "${stringResource(id = R.string.Rs)}2000/month",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black,
                    )
                }
            }

            //Spacer(modifier = Modifier.height(SpaceBetweenViews))

            RahnaSahnaButton(
                modifier = Modifier
                    .padding(HighPadding)
                    .fillMaxWidth()
                    .border(
                        width = 1.dp,
                        shape = RoundedCornerShape(LowCornerRadius),
                        color = Color.Black
                    )
                    .padding(vertical = MediumPadding),
                text = "Contact Owner",
                textColor = Color.Black,
                fontWeight = FontWeight.Normal,
            ) {}
        }
    }
}

@Preview
@Composable
fun SingleWishlistPreview() {
    SingleWishlist()
}