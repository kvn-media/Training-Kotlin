package com.enigmacamp.kotlinandroidvicapremium

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class ActivityCalculator : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)
        Log.i("MAINACTIVITY2", "OnCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.i("MAINACTIVITY2", "OnStart")

    }

    override fun onResume() {
        super.onResume()
        Log.i("MAINACTIVITY2", "OnResume")

    }

    override fun onPause() {
        super.onPause()
        Log.i("MAINACTIVITY2", "OnPause")

    }

    override fun onStop() {
        super.onStop()
        Log.i("MAINACTIVITY2", "OnStop")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("MAINACTIVITY2", "OnDestroy")

    }

}