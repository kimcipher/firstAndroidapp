package com.example.layout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class EnglandActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_england)

        var listView = findViewById<ListView>(R.id.listView)
        var arrayAdapter: ArrayAdapter<*>
        var players = arrayOf("Harry Kane -> Forward","Bukayo Saka-> Midfielder","Harry Maguire -> Defender","Raheem Sterling-> Forward","Marcus Rashford -> Defender"
            ,"Luke Shaw -> Defender","Trent Alexander-Arnold->Defender")

        arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, players)
        listView.adapter = arrayAdapter
    }
}