package com.example.mycalculator

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mycalculator.ui.theme.Purple200
import com.example.mycalculator.ui.theme.Purple500

@Composable
fun ButtonNumber(
    number: String,
    modifier: Modifier,
    onClick: () -> Unit,
) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .clip(CircleShape)
            .size(width = 70.dp, height = 80.dp)
            .border(width = 2.dp, Color.LightGray, shape = RoundedCornerShape(10.dp))
            .background(Purple200)
            .clickable { onClick() }
    )
    {
        Text(
            text = number,
            fontSize = 60.sp,
            color = Color.Cyan
        )
    }
}

@Composable
fun ButtonSymbol(
    symbol: String,
    modifier: Modifier,
    onClick: () -> Unit,
) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .clip(CircleShape)
            .size(width = 70.dp, height = 80.dp)
            .border(width = 2.dp, Color.LightGray, shape = RoundedCornerShape(10.dp))
            .background(Purple500)
            .clickable { onClick() }
    )
    {
        Text(
            text = symbol,
            fontSize = 60.sp,
            color = Color.Cyan
        )

    }
}
@Composable
fun ButtonClear(
    textClear: String,
    modifier: Modifier,
    onClick: () -> Unit,
) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .size(width = 150.dp, height = 80.dp)
            .clip(CircleShape)
            .background(Purple500)
            .border(width = 4.dp, Color.LightGray, shape = RoundedCornerShape(10.dp))


            .clickable { onClick() }
    )
    {
        Text(
            text = textClear,
            fontSize = 60.sp,
            color = Color.Cyan
        )
    }
}
