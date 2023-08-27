package com.example.intothedarkness.ui.composables

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.intothedarkness.R

@Composable
fun ChangeThemeButton(
    isDarkTheme: Boolean,
    onChangeThemeClicked: () -> Unit
) {
    Button(
        onClick = onChangeThemeClicked,
        modifier = Modifier
            .height(150.dp)
            .width(300.dp),
    ) {
        Text(
            text = String.format(stringResource(R.string.change_theme_button_text), setButtonText(isDarkTheme)),
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.CenterVertically)
        )
    }
}

@Composable
fun setButtonText(isDarkTheme: Boolean): String =
    if (isDarkTheme) stringResource(id = R.string.light_mode_text) else stringResource(R.string.dark_mode_text)
