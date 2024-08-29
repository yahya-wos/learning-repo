package com.wos.mashe.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /**
         * this is new comment added
         */


        val btnSumit = findViewById<Button>(R.id.btnSumit)
        btnSumit.setOnClickListener {
            Toast.makeText(this, "Button Click..", Toast.LENGTH_SHORT).show()
        }
    }
}