package com.example.myfirstgame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_game_over.*

class GameOver : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_over)
        var rightAnswerCount=intent.getIntExtra(PlayActivity.RIGHT_ANSWERS_COUNT, 0)
        tvScore.text = "$rightAnswerCount/${PlayActivity.COUNT_OF_QUESTION}"
        resBtn.setOnClickListener {
            val menu = Intent(this, MainActivity::class.java)
            menu.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            startActivity(menu)
            finish()
        }
    }
}
