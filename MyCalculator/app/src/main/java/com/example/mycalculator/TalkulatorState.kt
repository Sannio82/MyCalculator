package com.example.mycalculator

data class TalkulatorState(
    val number1: String = "",
    val number2: String = "",
    val operation: TalkulatorOperation? = null
)
