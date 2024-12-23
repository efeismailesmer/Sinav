package com.ahievranmtal.mobilteknolojiler

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ahievranmtal.mobilteknolojiler.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
}
