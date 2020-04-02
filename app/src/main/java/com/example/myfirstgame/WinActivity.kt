package com.example.myfirstgame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_win_activity.*
import android.content.Intent as Intent

class WinActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_win_activity)
        btnMainM.setOnClickListener {
            val mainM = Intent(this, MainActivity::class.java)
            startActivity(mainM)
            finish()
        }
        btnEX.setOnClickListener {
            finish()
        }
    }
}
