package com.app.rahnasahna.ui.componenet

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.app.rahnasahna.ui.theme.HintColor

@Composable
fun OutlineEditTextField(
    hint: String,
    inputValue: MutableState<String>,
    onValueChange: (value: String) -> Unit,
    keyboardOptions: KeyboardOptions,
    isSingleLine: Boolean = true
) {
    OutlinedTextField(
        modifier = Modifier
            .fillMaxWidth(),
        value = inputValue.value,
        onValueChange = { onValueChange(it) },
        placeholder = { HintText(hint = hint) },
        keyboardOptions = keyboardOptions,
        singleLine = isSingleLine,
        )
}

@Composable
fun HintText(hint: String) {
    Text(text = hint, color = HintColor, fontSize = 14.sp)
}

@Preview
@Composable
fun OutlineEditTextFieldPreview() {
    val inputValue = remember { mutableStateOf(String()) }
    OutlineEditTextField(
        hint = "Username*",
        inputValue = inputValue,
        onValueChange = {value -> inputValue.value = value},
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
    )
}