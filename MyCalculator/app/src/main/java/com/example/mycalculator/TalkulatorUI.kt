package com.example.mycalculator

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mycalculator.ui.theme.Purple200
import com.example.mycalculator.ui.theme.Purple500

@Composable
fun TalkulatorUI(
    state: TalkulatorState,
    calculatorButtonSpacing: Dp = 15.dp,
    modifier: Modifier = Modifier,
    onAction: (TalkulatorAction) -> Unit
)
{
    Box(modifier = Modifier) {
        Column (
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomStart),
            verticalArrangement = Arrangement.spacedBy(calculatorButtonSpacing)
                ){
            Text (
                text = state.number1 + (state.operation?.symbol ?: "") + state.number2,
                textAlign = TextAlign.End,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 32.dp),
                fontWeight = FontWeight.Light,
                fontSize = 60.sp,
                color = Purple500,
                maxLines = 1
                    )
            Row(
                modifier = Modifier
                    .background(Color.Transparent),
                horizontalArrangement = Arrangement.spacedBy(calculatorButtonSpacing)
            ) {
                ButtonClear(
                    textClear = "Clear",
                    modifier = Modifier,
                    onClick = {
                        onAction(TalkulatorAction.Clear)
                    }
                    )

            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(calculatorButtonSpacing)
            ) {
                ButtonNumber(
                    number = "7",
                    modifier = Modifier
                        .background(Purple200),
                    onClick = {
                        onAction(TalkulatorAction.Number(number = 7))
                    }
                )
                ButtonNumber(
                    number = "8",
                    modifier = Modifier
                        .background(Purple200),
                    onClick = {
                        onAction(TalkulatorAction.Number(number = 8))
                    }
                )
                ButtonNumber(
                    number = "9",
                    modifier = Modifier
                        .background(Purple200),
                    onClick = {
                        onAction(TalkulatorAction.Number(number = 9))
                    }
                )
                ButtonSymbol(
                    symbol = "*",
                    modifier = Modifier
                        .background(Purple500),
                    onClick = {
                        onAction(TalkulatorAction.Operation(TalkulatorOperation.Multiply))
                    }
                )
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(calculatorButtonSpacing)
            ) {
                ButtonNumber(
                    number = "4",
                    modifier = Modifier
                        .background(Purple200),
                    onClick = {
                        onAction(TalkulatorAction.Number(number = 4))
                    }
                )
                ButtonNumber(
                    number = "5",
                    modifier = Modifier
                        .background(Purple200),
                    onClick = {
                        onAction(TalkulatorAction.Number(number = 5))
                    }
                )
                ButtonNumber(
                    number = "6",
                    modifier = Modifier
                        .background(Purple200),
                    onClick = {
                        onAction(TalkulatorAction.Number(number = 6))
                    }
                )
                ButtonSymbol(
                    symbol = "-",
                    modifier = Modifier
                        .background(Purple500),
                    onClick = {
                        onAction(TalkulatorAction.Operation(TalkulatorOperation.Subtract))
                    }
                )
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(calculatorButtonSpacing)
            ) {
                ButtonNumber(
                    number = "1",
                    modifier = Modifier
                        .background(Purple200),
                    onClick = {
                        onAction(TalkulatorAction.Number(number = 1))
                    }
                )
                ButtonNumber(
                    number = "2",
                    modifier = Modifier
                        .background(Purple200),
                    onClick = {
                        onAction(TalkulatorAction.Number(number = 2))
                    }
                )
                ButtonNumber(
                    number = "3",
                    modifier = Modifier
                        .background(Purple200),
                    onClick = {
                        onAction(TalkulatorAction.Number(number = 3))
                    }
                )
                ButtonSymbol(
                    symbol = "+",
                    modifier = Modifier
                        .background(Purple500),
                    onClick = {
                        onAction(TalkulatorAction.Operation(TalkulatorOperation.Add))
                    }
                )
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(calculatorButtonSpacing)
            ) {
                ButtonNumber(
                    number = "0",
                    modifier = Modifier
                        .background(Purple200),
                    onClick = {
                        onAction(TalkulatorAction.Number(number = 0))
                    }
                )
                ButtonSymbol(
                    symbol = ",",
                    modifier = Modifier
                        .border(width = 3.dp, Color.Cyan)
                        .background(Purple500),
                    onClick = {
                        onAction(TalkulatorAction.Decimal)
                    }
                )
                ButtonSymbol(
                    symbol = "=",
                    modifier = Modifier
                        .background(Purple500),
                    onClick = {
                        onAction(TalkulatorAction.Calculate)
                    }
                )
                ButtonSymbol(
                    symbol = "/",
                    modifier = Modifier
                        .background(Purple500),
                    onClick = {
                        onAction(TalkulatorAction.Operation(TalkulatorOperation.Divide))
                    }
                )
            }
        }
     }
}