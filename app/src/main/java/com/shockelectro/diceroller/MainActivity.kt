package com.shockelectro.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Pasa el boton del xml a Obtejo Java
        val rolButton: Button = findViewById<Button>(R.id.rollbutton);
        // Cambia el texto del boton
        rollbutton.text = "Lest Roll";
    }
}
