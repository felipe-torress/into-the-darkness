package com.example.intothedarkness.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import com.example.intothedarkness.ui.composables.ChangeThemeButton
import com.example.intothedarkness.ui.theme.IntoTheDarknessTheme

@Composable
fun HomeScreen() {
    var isDarkTheme by remember { mutableStateOf(false) }
    IntoTheDarknessTheme(darkTheme = isDarkTheme) {
        Surface(
            color = MaterialTheme.colorScheme.background,
            modifier = Modifier
                .testTag("HomeScreenSurface")
                .fillMaxSize()
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .testTag("HomeScreenColumn")
            ) {
                ChangeThemeButton(
                    isDarkTheme = isDarkTheme,
                    onChangeThemeClicked = { isDarkTheme = !isDarkTheme }
                )
            }
        }
    }
}