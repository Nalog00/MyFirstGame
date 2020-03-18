package com.example.myfirstgame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnStart.setOnClickListener {
        val NextList = Intent(this, start:: class.java )
            startActivity(NextList)
        }
        btnExit.setOnClickListener {
            finish()
        }
    }

}
