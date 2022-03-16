package com.enigmacamp.kotlinandroidvicapremium

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.enigmacamp.kotlinandroidvicapremium.TicTacToe.Companion.FIRST_NAME
import com.enigmacamp.kotlinandroidvicapremium.TicTacToe.Companion.LAST_NAME

class BoardActivity  : AppCompatActivity() {
    private lateinit var playerName : TextView
    private var activePlayer = 1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_Board)
        playerName = findViewById(R.id.textView3)
        val playerOne = intent.getStringExtra(FIRST_NAME)
        playerName.text = "${playerOne}'s Turn"
    }
    private fun playGame(buttonSelected: Button) {
        val playerOne = intent.getStringExtra(FIRST_NAME)
        val playerTwo = intent.getStringExtra(LAST_NAME)
        if(activePlayer==1){
            playerName.text = "$playerTwo's Turn"
            buttonSelected.text = "X"
            activePlayer = 2
        }else{
            playerName.text = "$playerOne's Turn"
            buttonSelected.text = "O"
            activePlayer = 1
        }
        //disable button, after click
        buttonSelected.isEnabled = false;
    }
    fun buttonClick(view: View) {
        val buttonSelected = view as Button
        playGame(buttonSelected)
    }
}