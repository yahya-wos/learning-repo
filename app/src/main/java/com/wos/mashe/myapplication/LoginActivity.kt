package com.wos.mashe.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val BtnSend=findViewById<Button>(R.id.BtnSend)

        BtnSend.setOnClickListener {
            Toast.makeText(this, "Button Click...", Toast.LENGTH_SHORT).show()
        }
    }
}