package com.example.click_o_counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var countText: TextView
    private lateinit var clickMeButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        countText = findViewById(R.id.countText)
        clickMeButton = findViewById(R.id.clickMeButton)

        clickMeButton.setOnClickListener{
            var currentCount = countText.text.toString().toInt()
            var newCount = currentCount + 1
            countText.text = newCount.toString()

        }
    }
}