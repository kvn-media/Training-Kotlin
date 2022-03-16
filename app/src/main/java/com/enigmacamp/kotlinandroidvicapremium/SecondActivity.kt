package com.enigmacamp.kotlinandroidvicapremium

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.google.android.material.textview.MaterialTextView

class SecondActivity : AppCompatActivity() {
    private lateinit var nametextView : MaterialTextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        Log.i("SECONDACTIVITY","OnCreate")
        nametextView = findViewById(R.id.text_view_secondActivity)

        val name = intent.getStringExtra(MainActivity.USER_NAME)
        nametextView.text = name
    }
    override fun onStart() {
        super.onStart()
        Log.i("SECONDACTIVITY","OnStart")
    }
    override fun onResume() {
        super.onResume()
        Log.i("SECONDACTIVITY", "OnResume")
    }
    override fun onPause() {
        super.onPause()
        Log.i("SECONDACTIVITY", "OnPause")
    }
    override fun onStop() {
        super.onStop()
        Log.i("SECONDACTIVITY", "OnStop")
    }
    override fun onRestart() {
        super.onRestart()
        Log.i("SECONDACTIVITY", "OnRestart")
    }
    fun backtomainActivity(view: View){
        finish()
    }
}