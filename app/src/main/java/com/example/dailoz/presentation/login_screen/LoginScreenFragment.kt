package com.example.dailoz.presentation.login_screen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.dailoz.databinding.FragmentLoginScreenBinding
import com.example.dailoz.util.viewBinding

class LoginScreenFragment : Fragment() {

    private val binding by viewBinding(FragmentLoginScreenBinding::bind)

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return binding.root
    }
}