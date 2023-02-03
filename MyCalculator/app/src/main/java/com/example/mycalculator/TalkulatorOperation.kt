package com.example.mycalculator

sealed class TalkulatorOperation(val symbol: String) {
    object Add: TalkulatorOperation("+")
    object Subtract: TalkulatorOperation("-")
    object Multiply: TalkulatorOperation("*")
    object Divide: TalkulatorOperation("/")
}