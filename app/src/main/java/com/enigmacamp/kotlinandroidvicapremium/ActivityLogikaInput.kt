package com.enigmacamp.kotlinandroidvicapremium

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textview.MaterialTextView

class ActivityLogikaInput : AppCompatActivity() {
    private lateinit var textInputName: TextInputEditText
    private lateinit var textViewName: MaterialTextView

    override fun onCreate(savedInstacesState: Bundle?){
        super.onCreate(savedInstacesState)
        setContentView(R.layout.activity_logika_input)

        textInputName = findViewById(R.id.input_name)
        textViewName = findViewById(R.id.text_view_name)
    }

    fun showName(view: View){
        val name = textInputName.text
        textViewName.text = name
    }
}