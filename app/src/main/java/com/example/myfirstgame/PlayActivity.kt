package com.example.myfirstgame

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_start.*
import kotlin.random.Random

class PlayActivity : AppCompatActivity() {
    var countOfQuestion = 10
    var score = 1
    var res = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)
        plus()
    }

    fun plus() {
        val a = Random.nextInt(1, 99)
        val b = Random.nextInt(1, 99)
        when (Random.nextInt(0, 4)) {
            0 -> {
                tv.text = ("$a+$b")
                res = a + b
                btn1.text = (res + 2).toString()
                btn2.text = (a + b + 1).toString()
                btn3.text = (a + res).toString()
                btn4.text = (b + res + 1).toString()
            }
            1 -> {
                tv.text = ("$a-$b")
                res = a - b
                btn2.text = (res + 2).toString()
                btn1.text = (a - b - 1).toString()
                btn3.text = (a - res + 1).toString()
                btn4.text = (b - res).toString()
            }
            2 -> {
                tv.text = ("$a*$b")
                res = a * b
                btn3.text = (res + 2).toString()
                btn2.text = (a * b + 1).toString()
                btn1.text = (a + res).toString()
                btn4.text = (b + res + 1).toString()
            }
            3 -> {
                res = Random.nextInt(1, 99)
                val a = res * b
                tv.text = ("$a/$b")
                res = a / b
                btn4.text = (res + 2).toString()
                btn2.text = (res + 1).toString()
                btn3.text = (a + res + 1).toString()
                btn1.text = (b + res).toString()
            }
        }
        when (Random.nextInt(0, 4)) {
            0 -> btn1.text = res.toString()
            1 -> btn2.text = res.toString()
            2 -> btn3.text = res.toString()
            3 -> btn4.text = res.toString()
        }

    }

    fun onClick(view: View) {
        val generalQuestion = (view as Button).text.toString().toInt()
        if (generalQuestion == res) {
            if (score == countOfQuestion) {
                val winActivity = Intent(this, WinActivity::class.java)
                startActivity(winActivity)
                finish()
            } else {
                plus()
                score++
                Level.text =("Level: $score").toString()
            }
        } else {
            val gameOver = Intent(this, GameOver::class.java)
            startActivity(gameOver)
            finish()
        }
    }
}










