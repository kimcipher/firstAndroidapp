package com.example.layout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class BrzailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_brzail)

        var listView = findViewById<ListView>(R.id.listView)
        var arrayAdapter: ArrayAdapter<*>
        var players = arrayOf("Neymar -> Forward","Raphinha -> Forward","Vini Jr. -> Forward","Gabriel Jesus -> Forward","Dani Alves -> Defender"
            ,"Marquinhos -> Defender","Casemiro ->Midfielder")

        arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, players)
        listView.adapter = arrayAdapter
    }
}