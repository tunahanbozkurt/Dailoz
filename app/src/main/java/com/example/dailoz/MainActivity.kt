package com.example.dailoz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dailoz.databinding.ActivityMainBinding
import com.example.dailoz.util.viewBinding

class MainActivity : AppCompatActivity() {

    private val binding by viewBinding(ActivityMainBinding::inflate)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}