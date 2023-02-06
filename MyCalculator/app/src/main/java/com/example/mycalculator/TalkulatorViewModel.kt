package com.example.mycalculator
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class TalkulatorViewModel: ViewModel() {

    var state by mutableStateOf(TalkulatorState())
        private set
    fun onAction(action: TalkulatorAction) {
        when(action) {
            is TalkulatorAction.Number -> enterNumber(action.number)
            is TalkulatorAction.Decimal -> enterDecimal()
            is TalkulatorAction.Clear -> state = TalkulatorState()
            is TalkulatorAction.Operation -> enterOperation(action.operation)
            is TalkulatorAction.Calculate -> performCalculation()
        }
    }
    private fun performCalculation() {
        val number1 = state.number1.toDoubleOrNull()
        val number2 = state.number2.toDoubleOrNull()
        if (number1 != null && number2 != null){
            val result = when (state.operation) {
                is TalkulatorOperation.Add -> number1 + number2
                is TalkulatorOperation.Subtract -> number1 - number2
                is TalkulatorOperation.Divide -> number1 / number2
                is TalkulatorOperation.Multiply -> number1 * number2
                null -> return
            }
            state = if (result.toString().contains("3")) {
                state.copy(
                    number1 = "No 3:s please",
                    number2 = "",
                    operation = null
                )
            } else {
                state.copy(
                    number1 = result.toString().take(25),
                    number2 = "",
                    operation = null
                )
            }
        }
    }
    private fun enterOperation(operation: TalkulatorOperation) {
        if(state.number1.isNotBlank()) {
            state = state.copy(operation = operation)
        }
    }
    private fun enterDecimal() {
        if (state.operation == null && !state.number1.contains(".")
        ) {
            state = state.copy(
                number1 = state.number1 + "."
            )
            return
        }
        if (!state.number2.contains(".")
        ) {
            state = state.copy(
                number2 = state.number2 + "."
            )
        }
    }
    private fun enterNumber(number: Int) {
        if(state.operation == null) {
            if(state.number1.length >= 8) {
                return
            }
            state = state.copy(
                number1 = state.number1 + number
            )
            return
        }
        if(state.number2.length >= 8) {
            return
        }
        state = state.copy(
            number2 = state.number2 + number
        )
    }
}
