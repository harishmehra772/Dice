package com.example.dice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
            rollDice()
            val diceImage:ImageView=findViewById(R.id.imageView)
        }
        rollDice()
    }

    private fun rollDice() {

        val diceObject = Dice(6)
        val diceroll = diceObject.roll()
        val diceImage:ImageView=findViewById(R.id.imageView)
       when(diceroll) {
           1->diceImage.setImageResource(R.drawable.dice_1)
           2->diceImage.setImageResource(R.drawable.dice_2)
           3->diceImage.setImageResource(R.drawable.dice_3)
           4->diceImage.setImageResource(R.drawable.dice_4)
           5->diceImage.setImageResource(R.drawable.dice_5)
           6->diceImage.setImageResource(R.drawable.dice_6)
       }
    }
}

class Dice(private val numberOfSides: Int) {
    fun roll(): Int {
        return (1..numberOfSides).random()
    }
}