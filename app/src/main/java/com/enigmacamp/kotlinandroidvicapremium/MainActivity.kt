package com.enigmacamp.kotlinandroidvicapremium

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    private lateinit var userNameText: TextInputEditText

    companion object{
        const val USER_NAME = "User_Name"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("MAINACTIVITY", "OnCreate")
        userNameText = findViewById(R.id.user_name_text_input)
    }

    fun moveToSecondActivity(view: View){
        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra(USER_NAME, userNameText.text.toString())
        startActivity(intent)
    }
    override fun onStart() {
        super.onStart()
        Log.i("MAINACTIVITY","OnStart")
    }
    override fun onResume() {
        super.onResume()
        Log.i("MAINACTIVITY", "OnResume")
    }
    override fun onPause() {
        super.onPause()
        Log.i("MAINACTIVITY", "OnPause")
    }
    override fun onStop() {
        super.onStop()
        Log.i("MAINACTIVITY", "OnStop")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.i("MAINACTIVITY", "OnDestroy")
    }
    override fun onRestart() {
        super.onRestart()
        Log.i("MAINACTIVITY", "OnRestart")
    }
}