package com.example.mycalculator

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class TalkulatorViewModel: ViewModel() {

    var state by mutableStateOf(TalkulatorState())
        private set
}