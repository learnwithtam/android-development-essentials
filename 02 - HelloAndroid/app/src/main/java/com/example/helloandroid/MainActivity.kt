package com.example.helloandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var clickMe: Button
    private lateinit var countText: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        clickMe = findViewById(R.id.clickButton)
        countText = findViewById(R.id.countText)

        clickMe.setOnClickListener{
            var current : Int = countText.text.toString().toInt()
            var new : Int = current + 1
            countText.text = new.toString()
        }
    }

    fun counter(view: View) : Unit{
        var current : Int = countText.text.toString().toInt()
        var new : Int = current + 1
        countText.text = new.toString()
    }

}