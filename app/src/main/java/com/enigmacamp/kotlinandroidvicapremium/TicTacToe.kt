package com.enigmacamp.kotlinandroidvicapremium

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textview.MaterialTextView

class TicTacToe : AppCompatActivity() {
    private lateinit var inputplayer1 : TextInputEditText
    private lateinit var inputplayer2 : TextInputEditText
    companion object {
        const val FIRST_NAME = "FIRST_NAME"
        const val LAST_NAME = "LAST_NAME"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        inputplayer1 = findViewById(R.id.input_player1)
        inputplayer2 = findViewById(R.id.input_player2)
    }
    fun letsPlay(view: View) {
        val intent = Intent(this, BoardActivity::class.java)
        intent.putExtra(FIRST_NAME, inputplayer1.text.toString())
        intent.putExtra(LAST_NAME, inputplayer2.text.toString())
        startActivity(intent)
    }
}