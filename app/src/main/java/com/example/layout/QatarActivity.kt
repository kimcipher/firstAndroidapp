package com.example.layout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class QatarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_qatar)

        var listView = findViewById<ListView>(R.id.listView)
        var arrayAdapter:ArrayAdapter<*>
        var players = arrayOf("Almoez Ali -> Forward","Pedro Miguel -> Defender","Akram Afif -> Forward","Hassan Al-Haydos -> Forward","Saad Al Sheeb -> Goalkeeper"
        ,"Karim Boudiaf -> Midfielder","Bassam Al Rawi -> Defender")

        arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, players)
        listView.adapter = arrayAdapter
    }
    // end onCreate
}
// end Class Qatar