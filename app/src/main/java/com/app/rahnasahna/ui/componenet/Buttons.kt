package com.app.rahnasahna.ui.componenet

import android.content.res.Configuration.UI_MODE_NIGHT_NO
import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.app.rahnasahna.ui.theme.*

@Composable
fun RahnaSahnaButton(
    modifier: Modifier = Modifier,
    text: String = "Continue",
    textColor: Color = Color.White,
    fontWeight: FontWeight = FontWeight.Bold,
    onClick: () -> Unit
) {
    Box(
        modifier = modifier
            .clickable { onClick() },
        contentAlignment = Alignment.Center
    ) {
        Text(text = text, color = textColor, fontWeight = fontWeight)
    }
}

@Preview
@Composable
fun DarkGreenButton() {
    RahnaSahnaButton(
        modifier = Modifier
            .padding(HighPadding)
            .fillMaxWidth()
            .background(
                color = MaterialTheme.colors.buttonBackground,
                shape = RoundedCornerShape(LowCornerRadius)
            )
            .padding(vertical = MediumPadding)
    ) {}
}

@Preview
@Composable
fun SharpCornerDarkGreenButton() {
    RahnaSahnaButton(
        modifier = Modifier
            .padding(HighPadding)
            .fillMaxWidth()
            .background(
                color = MaterialTheme.colors.buttonBackground
            )
            .padding(vertical = MediumPadding)
    ) {}
}

@Preview
@Composable
fun LoginButton() {
    RahnaSahnaButton(
        modifier = Modifier
            .padding(HighPadding)
            .fillMaxWidth()
            .background(color = Gray700)
            .padding(vertical = HighPadding),
        text = "Login",
        textColor = Color.Black,
        fontWeight = FontWeight.Light,
    ) {}
}

@Preview
@Composable
fun SignupButton() {
    RahnaSahnaButton(
        modifier = Modifier
            .padding(HighPadding)
            .fillMaxWidth()
            .background(color = Color.White)
            .padding(vertical = HighPadding),
        text = "SignUp",
        textColor = Color.Black,
        fontWeight = FontWeight.Light,
    ) {}
}

@Preview
@Composable
fun OutlineButton() {
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
