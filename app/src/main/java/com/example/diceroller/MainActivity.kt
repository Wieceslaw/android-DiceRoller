package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun roll(view: View) {
        val imageView1 : ImageView = findViewById(R.id.imageViewDice1)
        val imageView2 : ImageView = findViewById(R.id.imageViewDice2)
        val dice = Dice(6)
        imageView1.setImageResource(fetchSideImage(dice.roll()))
        imageView2.setImageResource(fetchSideImage(dice.roll()))
    }

    private fun fetchSideImage(i: Int): Int = when(i) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
}