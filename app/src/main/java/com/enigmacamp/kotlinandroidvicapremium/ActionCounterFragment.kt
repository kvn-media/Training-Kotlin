package com.enigmacamp.kotlinandroidvicapremium

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_action_counter.*


class ActionCounterFragment : Fragment(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_action_counter, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnIncrement.setOnClickListener(this)
        btnDecrement.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v) {
            btnIncrement -> {
                (activity as MainActivity2).handleIncrement()
            }
            btnDecrement -> {
                (activity as MainActivity2).handleDecrement()
            }
        }
    }
}