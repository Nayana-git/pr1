package com.example.pr1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var btnLogin: Button
    lateinit var btnSignup: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val editText = findViewById<EditText>(R.id.etUsername)
        // Getting the user input
        val text = editText.text
        btnLogin = findViewById(R.id.btnLogin)
        btnSignup = findViewById(R.id.btnSignupMain)
        btnLogin.setOnClickListener {
            if (text.equals("hacker")) {
                val intent = Intent(this, VictimListActivity::class.java)
                startActivity(intent)
            } else {
                val intent = Intent(this, VictimHomepage::class.java)
                startActivity(intent)
            }
        }

            btnSignup.setOnClickListener {
            val intent = Intent(this, SignupActivity::class.java)
            startActivity(intent)
        }
    }
}