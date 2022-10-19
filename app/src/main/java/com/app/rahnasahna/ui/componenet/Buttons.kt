package com.app.rahnasahna.ui.componenet

import android.content.res.Configuration.UI_MODE_NIGHT_NO
import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.background
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

@Preview(uiMode = UI_MODE_NIGHT_NO)
@Composable
fun LightRahnaSahnaButtonPreview() {
    RahnaSahnaButton(
        modifier = Modifier
            .fillMaxWidth()
            .background(
                color = MaterialTheme.colors.buttonBackground,
                shape = RoundedCornerShape(LowCornerRadius)
            )
            .padding(vertical = LowPadding)
    ) {}
}

@Preview(uiMode = UI_MODE_NIGHT_YES)
@Composable
fun DarkRahnaSahnaButtonPreview() {
    RahnaSahnaButton(
        modifier = Modifier
            .fillMaxWidth()
            .background(
                color = MaterialTheme.colors.buttonBackground,
                shape = RoundedCornerShape(LowCornerRadius)
            )
            .padding(vertical = LowPadding)
    ) {}
}