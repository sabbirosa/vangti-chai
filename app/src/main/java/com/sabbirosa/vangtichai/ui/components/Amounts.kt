package com.sabbirosa.vangtichai.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

val notesList = listOf(
    500, 100, 50, 20, 10, 5, 2, 1
)

@Composable
fun AmountsPortrait(width: Dp, map: MutableMap<Int, Int>) {
    Box(
        modifier = Modifier.layoutId("noteGrid")
    ) {
        Column(
            horizontalAlignment = Alignment.End,
        ) {
            Card(
                colors = CardDefaults.cardColors(containerColor = Color.Transparent)
            ) {
                for (n in notesList) {
                    Amount(n, width, map)
                }
            }
        }
    }
}

@Composable
fun AmountsLandscape(width: Dp, map: MutableMap<Int, Int>) {
    Box(
        modifier = Modifier.layoutId("noteGrid")
    ) {
        Row {
            Column {
                Card(
                    colors = CardDefaults.cardColors(containerColor = Color.Transparent)
                ) {
                    for (i in 0..3) {
                        Amount(notesList[i], width, map)
                    }
                }
            }
            Column {
                Card(
                    colors = CardDefaults.cardColors(containerColor = Color.Transparent)
                ) {
                    for (i in 4..7) {
                        Amount(notesList[i], width, map)
                    }
                }
            }
        }
    }
}

@Composable
fun Amount(n: Int, width: Dp, map: MutableMap<Int, Int>) {
    Row(
        modifier = Modifier.padding(vertical = 5.dp)
    ) {
        Text(
            text = "$n : ${map[n]}",
            textAlign = TextAlign.End,
            fontSize = 25.sp,
            modifier = Modifier
                .width(width)
                .layoutId("Amount$n")
        )
    }
}
