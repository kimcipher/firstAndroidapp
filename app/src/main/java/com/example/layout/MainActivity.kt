package com.example.layout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var qatar = findViewById<Button>(R.id.qatar)
        var equador = findViewById<Button>(R.id.equador)
        var brazil = findViewById<Button>(R.id.brazil)
        var england = findViewById<Button>(R.id.england)
        var stadiums = findViewById<Button>(R.id.stadiums)

        qatar.setOnClickListener{
            Toast.makeText(this, "Qatar lost Game", Toast.LENGTH_LONG).show()
            // intent - provide messaging between android activity

            val intent = Intent(applicationContext, QatarActivity::class.java)
            startActivity(intent)
        }
        equador.setOnClickListener{
            Toast.makeText(this, "Equador won Game", Toast.LENGTH_LONG).show()

            val intent = Intent(applicationContext, EquadorActivity::class.java)
            startActivity(intent)
        }
        brazil.setOnClickListener{
            Toast.makeText(this, "Neymar to score", Toast.LENGTH_LONG).show()

            val intent = Intent(applicationContext, BrzailActivity::class.java)
            startActivity(intent)
        }
        england.setOnClickListener{
            Toast.makeText(this, "We got Sterling and Kane", Toast.LENGTH_LONG).show()

            val intent = Intent(applicationContext, EnglandActivity::class.java)
            startActivity(intent)

        }
        stadiums.setOnClickListener{
            Toast.makeText(this, "View Stadiums", Toast.LENGTH_SHORT).show()

            val intent = Intent(applicationContext, StadiumActivity::class.java)
            startActivity(intent)
        }
    }
}

// layout in android
/* ViewGroup and a Views
ViewGroup -> is how android components(views) will be arraigned on the screen
-> Constraint Layout - one item on screen
-> Linear Layout - vertically/horizontally
-> Relative Layout - arraigned in relative to one another
Views -> components on the screen(Activity), Button, EditText, TextView, ImageView, RadioButton
CheckBox, WebView, CardView, RecyclerView ,DatePicker, ProgressBar, Spinners....
XML -> WE use this to create a view on an Activity.(Extended Markup Language)
Folders required
*Manifest- describe application thus used to execute the application, themes, permissions
*java - stores the android activities
*res - resources) -> stores resources needed for your app
i) Drawable -> store images, lowercase names
ii) layout -> show the designs of a screen(Activity)
 */

// Toast -> message popup
// Intent ->