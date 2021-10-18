package com.example.buttoncounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var tv: TextView

    private lateinit var btnp: Button
    private lateinit var btnm: Button

    var counter = 26
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv = findViewById(R.id.textView)

        btnp = findViewById(R.id.btnp)
        btnm = findViewById(R.id.btnm)


        btnp.setOnClickListener {
            plus()
        }
        btnm.setOnClickListener {
            minse()
        }

    }

    fun plus() {
        counter++
        tv.text = counter.toString()
    }

    fun minse() {
        counter--
        tv.text = counter.toString()
    }
}
