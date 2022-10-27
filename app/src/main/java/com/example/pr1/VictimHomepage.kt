package com.example.pr1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class VictimHomepage : AppCompatActivity() {

    lateinit var btnFacebook: Button
    lateinit var btnInstagram: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_victim_homepage)

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