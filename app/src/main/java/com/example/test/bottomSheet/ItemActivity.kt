package com.example.test.bottomSheet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.test.R

class ItemActivity : AppCompatActivity() {
    lateinit var tvUsername : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_item)

        tvUsername = findViewById(R.id.tvUserName)

        var userName = intent.getStringExtra("data")
        tvUsername.text = userName

    }
}