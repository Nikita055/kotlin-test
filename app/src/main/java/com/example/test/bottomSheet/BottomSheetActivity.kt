package com.example.test.bottomSheet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.test.R
//https://www.youtube.com/watch?v=W2h76Yjl1ZQ
class BottomSheetActivity : AppCompatActivity() {

    lateinit var bottomSheetBtn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom_sheet)

        bottomSheetBtn = findViewById(R.id.bottom_sheet)

        bottomSheetBtn.setOnClickListener {
           var bottomFragment = BottomFragment();
            bottomFragment.show(supportFragmentManager,"TAG")
        }
    }
}