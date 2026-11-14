package ru.yandex.practicum.textfield

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class TextViewModel : ViewModel() {
    private val _text = MutableStateFlow("")
    val text: StateFlow<String> = _text.asStateFlow()

    private val _title = MutableStateFlow("Введите текст")
    val title: StateFlow<String> = _title.asStateFlow()

    fun onTextChanged(newText: String) {
        _text.value = newText
    }

    fun onApplyText() {
        _title.value = _text.value
    }
}
