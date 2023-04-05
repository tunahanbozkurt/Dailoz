package com.example.dailoz.presentation.custom_views

import android.content.Context
import android.text.method.PasswordTransformationMethod
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import com.example.dailoz.databinding.EditTextPasswordToggleBinding

class PasswordTextField(
    context: Context,
    attrs: AttributeSet?
) : FrameLayout(context, attrs) {

    private var binding: EditTextPasswordToggleBinding

    init {
        binding = EditTextPasswordToggleBinding.inflate(
            LayoutInflater.from(context),
            this,
            true
        )
        setupListeners()
    }

    private fun setupListeners() {
        val method = PasswordTransformationMethod()

        binding.apply {
            etPasswordContainer.setOnClickListener {
                etPassword.requestFocus()
            }

            icToggleButton.setOnClickListener {
                val transformationMethod = etPassword.transformationMethod

                etPassword.transformationMethod =
                    if (transformationMethod is PasswordTransformationMethod)
                        null else method

                etPassword.setSelection(etPassword.text.length)
            }
        }
    }
}