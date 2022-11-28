package com.example.pr1

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView

class VictimListActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_victim_list)
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
