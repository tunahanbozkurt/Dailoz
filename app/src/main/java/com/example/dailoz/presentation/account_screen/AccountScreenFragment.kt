package com.example.dailoz.presentation.account_screen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.dailoz.databinding.FragmentAccountScreenBinding
import com.example.dailoz.util.viewBinding

class AccountScreenFragment : Fragment() {

    private val binding by viewBinding(FragmentAccountScreenBinding::bind)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return binding.root
    }
}