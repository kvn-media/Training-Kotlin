package com.enigmacamp.kotlinandroidvicapremium

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentTransaction


class MainActivity2 : AppCompatActivity() {

    lateinit var showCFragment: ShowCFragment

    var counter: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_main_activity2)

        showCFragment = ShowCFragment()

        if (savedInstanceState == null) {
            val fragmentTransaction: FragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragment_show_counter, showCFragment)
            fragmentTransaction.commit()
        }
    }
    fun handleIncrement(){
        this.counter +=1
        Log.d("COUNTER", this.counter.toString())
    }
    fun handleDecrement(){
        this.counter +=1
        Log.d("COUNTER", this.counter.toString())
    }
}
