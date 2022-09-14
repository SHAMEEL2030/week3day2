package com.example.week3day2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val username = findViewById<EditText>(R.id.Edit_Text)
        val password = findViewById<EditText>(R.id.Edit_Text2)
        val confirmpassword = findViewById<EditText>(R.id.Edit_Text3)
        val register = findViewById<Button>(R.id.button)
        register.setOnClickListener {
            RegistrationUtil.validateInput(
                username.text.toString(),password.text.toString(),confirmpassword.text.toString()
            )
        }

        }
    }
