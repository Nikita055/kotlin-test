package com.example.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.inflate
import com.example.test.databinding.ActivityDataBindingBinding
import com.example.test.databinding.ActivityMainBinding
//https://www.youtube.com/watch?v=z0F2QTAKsWU
class DataBindingActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDataBindingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

         binding = ActivityDataBindingBinding.inflate(layoutInflater)
        binding.tvHelloWorld
        val view : View = binding.root
        setContentView(view)
        //setContentView(binding.root)


    }
}