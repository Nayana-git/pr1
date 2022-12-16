package com.example.pr1

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView

class VictimListActivity : AppCompatActivity() {
    lateinit var btnStat: Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_victim_list)
        btnStat = findViewById(R.id.Stat)
        btnStat.setOnClickListener {
            val intent = Intent(this, HackerStats::class.java)
            startActivity(intent)
        }
        val arrayAdapter: ArrayAdapter<*>
        val users = arrayOf(
            "victim1", "victim2", "victim3"
        )

        var mListView = findViewById<ListView>(R.id.userList)
        val mAdapter: ArrayAdapter<*> = ArrayAdapter<Any?>(this, android.R.layout.simple_list_item_1, users)
        mListView.adapter = mAdapter
        mListView.onItemClickListener = AdapterView.OnItemClickListener{_,_,index,_ ->
            val intent = Intent(this, AccountDetailsActivity::class.java)
            startActivity(intent)

        }

    }
}
