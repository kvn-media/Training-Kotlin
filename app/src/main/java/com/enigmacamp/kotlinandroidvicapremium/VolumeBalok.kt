package com.enigmacamp.kotlinandroidvicapremium

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText

class VolumeBalok  : AppCompatActivity() {
    private lateinit var inputPanjang: TextInputEditText
    private lateinit var inputLebar: TextInputEditText
    private lateinit var inputTinggi: TextInputEditText
    // private lateinit var buttonHitung: MaterialButton
    private lateinit var txtResult: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        inputPanjang = findViewById(R.id.input_panjang)
        inputLebar = findViewById(R.id.input_lebar)
        inputTinggi = findViewById(R.id.input_tinggi)
// buttonHitung = findViewById(R.id.btn_hitung)
        txtResult = findViewById(R.id.txt_hasil)
    }
    fun resultVolumeBalok(view: View) {
        val panjang = inputPanjang.text.toString()
        val lebar = inputLebar.text.toString()
        val tinggi = inputTinggi.text.toString()
        val volume = panjang.toDouble() * lebar.toDouble() * tinggi.toDouble()
        txtResult.text = volume.toString()
    }
}