package com.example.myapp17

import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.input.OffsetMapping
import androidx.compose.ui.text.input.TransformedText
import androidx.compose.ui.text.input.VisualTransformation

class PwdTransformation : VisualTransformation {
    override fun filter(text: AnnotatedString): TransformedText {
        val transormedText = "*".repeat(text.length)
        return TransformedText(AnnotatedString(transormedText), OffsetMapping.Identity)
    }
}