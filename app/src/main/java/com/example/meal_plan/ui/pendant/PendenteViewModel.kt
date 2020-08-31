package com.example.meal_plan.ui.pendant

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PendenteViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Pendant Fragment"
    }
    val text: LiveData<String> = _text
}