package com.shockelectro.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

import java.util.Random


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Pasa el boton del xml a Obtejo Java
        val rolButton: Button = findViewById<Button>(R.id.rollbutton);
        // Cambia el texto del boton
        rollbutton.text = "Lest Roll";
        rolButton.setOnClickListener{
            //Toast.makeText(this, "button click", Toast.LENGTH_LONG).show();
            rollDice()
        }
    }

    private fun rollDice(){
        val randomInt= Random().nextInt(6)+1
        val drawableResource = when (randomInt){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        val diceImage: ImageView= findViewById(R.id.dice_image)
        diceImage.setImageResource(drawableResource)
    }
}
