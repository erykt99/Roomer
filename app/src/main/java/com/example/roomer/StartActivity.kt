package com.example.roomer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class StartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)

        val signUpButton = findViewById<Button>(R.id.singUpButton)
        signUpButton.setOnClickListener {
        val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
            finish()
        }
    }





}