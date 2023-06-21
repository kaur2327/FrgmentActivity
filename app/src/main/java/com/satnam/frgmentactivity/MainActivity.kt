package com.satnam.frgmentactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnred : Button
    lateinit var btnblue : Button
    lateinit var btngreen : Button
    lateinit var btnzero : Button
    lateinit var ActivityInterface:ActivityInterface
    var number = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnred = findViewById(R.id.btnred)
        btnblue = findViewById(R.id.btnblue)
        btngreen = findViewById(R.id.btngreen)
        btnzero = findViewById(R.id.btnzero)
        btnred.setOnClickListener {
            ActivityInterface.setRedColor()
        }
        btnblue.setOnClickListener {
            ActivityInterface.setBlueColor()
        }
        btngreen.setOnClickListener {
            ActivityInterface.setGreenColor()
        }
    }
    fun updateNumber(){
        btnzero.setText(number.toString())
    }


}