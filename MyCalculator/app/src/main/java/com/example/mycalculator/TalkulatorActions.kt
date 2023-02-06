package com.example.mycalculator
sealed class TalkulatorAction {
    data class Number(val number: Int): TalkulatorAction()
    object Clear: TalkulatorAction()
    object Decimal: TalkulatorAction()
    object Calculate: TalkulatorAction()
    data class Operation(val operation: TalkulatorOperation): TalkulatorAction()
}