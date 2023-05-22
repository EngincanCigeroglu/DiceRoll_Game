package com.example.diceroll

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.graphics.Color
import org.w3c.dom.Text
import kotlin.random.nextInt

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)

        rollButton.setOnClickListener {
            rollDice()
        }

        val resetButton: Button = findViewById(R.id.reset_button)

        resetButton.setOnClickListener {
            Reset()
        }
    }
    private fun rollDice()
    {
        val randomInt1 = kotlin.random.Random.nextInt(6)+1
        val randomInt2 = kotlin.random.Random.nextInt(6)+1

        val Player1: TextView = findViewById(R.id.Player1)
        val Player2: TextView = findViewById(R.id.Player2)
        val WhoWon: TextView = findViewById(R.id.whowon)

        Player1.text = randomInt1.toString()
        Player2.text = randomInt2.toString()

        if(randomInt1 > randomInt2)
        {
            WhoWon.text = "Player 1 Won!"
            WhoWon.visibility = View.VISIBLE
            Player1.setTextColor(Color.parseColor("#FF26DC53"))
            Player2.setTextColor(Color.parseColor("#000000"))

        }else if(randomInt1 < randomInt2){

            WhoWon.text = "Player 2 Won!"
            WhoWon.visibility = View.VISIBLE
            Player2.setTextColor(Color.parseColor("#FF26DC53"))
            Player1.setTextColor(Color.parseColor("#000000"))

        }else if(randomInt1 == randomInt2)
        {
            WhoWon.text = "Its Equal"
            WhoWon.visibility = View.VISIBLE
            Player1.setTextColor(Color.parseColor("#000000"))
            Player2.setTextColor(Color.parseColor("#000000"))
        }


    }

    private fun Reset(){
        val Player1: TextView = findViewById(R.id.Player1)
        val Player2: TextView = findViewById(R.id.Player2)
        val WhoWon: TextView = findViewById(R.id.whowon)

        WhoWon.text = ""
        WhoWon.visibility = View.INVISIBLE

        Player1.text = ""
        Player2.text = ""


    }
}