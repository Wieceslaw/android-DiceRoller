package com.example.diceroller

class Dice(private val sidesCount: Int) {
    fun roll(): Int {
        return (1..sidesCount).random()
    }
}