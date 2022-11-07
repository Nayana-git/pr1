package com.example.pr1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PasswordList : AppCompatActivity() {

    lateinit var btnFacebook: Button
    lateinit var btnInstagram: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_password_list)

        btnFacebook = findViewById(R.id.btnFacebook)
        btnInstagram = findViewById(R.id.btnInstagram)

        btnFacebook.setOnClickListener {
            val intent = Intent(this, AccountDetail::class.java)
            startActivity(intent)
        }

        btnInstagram.setOnClickListener {
            val intent = Intent(this, VictimStats::class.java)
            startActivity(intent)
        }
    }
}