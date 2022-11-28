package com.example.pr1

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class VictimHomepage : AppCompatActivity() {
    lateinit var btnPwd: Button
    lateinit var btnTest: Button
    lateinit var btnStat: Button
    lateinit var btnHack: Button


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_victim_homepage2)


        btnPwd = findViewById(R.id.btnPassword)
        btnTest = findViewById(R.id.btnTakeTest)
        btnStat = findViewById(R.id.btnStats)
        btnHack = findViewById(R.id.btnHacker)

        btnPwd.setOnClickListener {
            val intent = Intent(this, PasswordList::class.java)
            startActivity(intent)
        }

        btnTest.setOnClickListener {
            val intent = Intent(this, VictimTestActivity::class.java)
            startActivity(intent)
        }

        btnStat.setOnClickListener {
            val intent = Intent(this, VictimStats::class.java)
            startActivity(intent)
        }

        btnHack.setOnClickListener {
            val intent = Intent(this, VictimListActivity::class.java)
            startActivity(intent)
        }
    }
}