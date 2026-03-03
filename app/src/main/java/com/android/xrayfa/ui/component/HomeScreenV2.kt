package com.android.xrayfa.ui.component

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview
@Composable
fun HomeScreenV2Preview() {
    HomeScreenV2()
}
@Composable
fun HomeScreenV2() {
    Scaffold(
        containerColor = Color.White
    ) { padding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
        ) {
            Canvas(Modifier
                .size(400.dp)
                .align(Alignment.TopCenter)
            ) {
                val ovalWidth = size.width *1.25f
                val ovalHeight = size.height *0.5f
                drawOval(
                    brush = Brush.linearGradient(listOf(Color.Red, Color.Blue)),
                    size = Size(ovalWidth, size.height *1.25f),
                    topLeft = Offset(
                        x = (size.width - ovalWidth) /2f,
                        y = -(size.height - ovalHeight)/2f
                    )
                )
            }
        }
    }
}

