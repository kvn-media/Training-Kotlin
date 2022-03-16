package com.enigmacamp.kotlinandroidvicapremium

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textview.MaterialTextView

class ActivityMainLayout : AppCompatActivity() {
    private lateinit var textView: MaterialTextView
    private var starcounter = 0

    override fun onCreate(savedInstacesState: Bundle?) {
        super.onCreate(savedInstacesState)
        setContentView(R.layout.activity_main_layout)

        textView = findViewById(R.id.text_view_name)
    }

    fun increase(view: View) {
        starcounter += 1
        textView.text = starcounter.toString()
    }

    fun decrese(view: View) {
        starcounter += -1
        textView.text = starcounter.toString()
    }
}