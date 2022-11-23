package com.example.layout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class EquadorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_equador)

        var listView = findViewById<ListView>(R.id.listView)
        var arrayAdapter: ArrayAdapter<*>
        var players = arrayOf("Enner Valencia -> Forward","Piero Hincapie -> Defender","Michael Estrada -> Forward","William Pacho -> Centre-back","Moses Ramirez -> Goalkeeper"
            ,"Gonzalo Plata -> Right-winger","Angel Mena ->Right Winger")

        arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, players)
        listView.adapter = arrayAdapter
    }
}