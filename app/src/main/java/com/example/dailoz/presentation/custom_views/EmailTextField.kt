package com.example.dailoz.presentation.custom_views

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import com.example.dailoz.databinding.EditTextEmailBinding

class EmailTextField(
    context: Context,
    attrs: AttributeSet?
) : FrameLayout(context, attrs) {

    private var binding: EditTextEmailBinding

    init {
        binding = EditTextEmailBinding.inflate(
            LayoutInflater.from(context),
            this,
            true
        )
        setupListener()
    }

    private fun setupListener() {
        binding.apply {
            editTextEmailContainer.setOnClickListener {
                etEmail.requestFocus()
            }
        }
    }
}