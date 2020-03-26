package com.example.myfirstgame
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_start.*
import kotlin.random.Random
var a = Random.nextInt(1, 99)
var b = Random.nextInt(1, 99)
var result = 0
val x = Random.nextInt(1, 4)
class PlayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)
        tv.text = when (x) {
            1 -> "$a+$b"
            2 -> "$a-$b"
            3 -> "$a*$b"
            else -> {
                "$a/$b"
            }
        }
        plus()
    }
    fun plus() {
        when (x) {
            1 -> {
                result = a + b
                btn1.text = result.toString()
                btn2.text = (a + b + 1).toString()
                btn3.text = (a + result).toString()
                btn4.text = (b + result + 1).toString()
            }
            2 -> {
                result = a - b
                btn2.text = result.toString()
                btn1.text = (a - b - 1).toString()
                btn3.text = (a - result + 1).toString()
                btn4.text = (b - result).toString()
            }
            3 -> {
                result = a * b
                btn3.text = result.toString()
                btn2.text = (a * b + 1).toString()
                btn1.text = (a + result).toString()
                btn4.text = (b + result + 1).toString()
            }
            4 -> {
                btn4.text = (a / b).toString()
                btn2.text = (a / b + 1).toString()
                btn3.text = (a + result + 1).toString()
                btn1.text = (b + result).toString()
            }
        }
    }
    fun onClick(view: View) {
        val generalAnswer = (view as Button).text.toString().toInt()
        if (generalAnswer == result) {
            val nextLevel = Intent(this, PlayActivity::class.java)
            startActivity(nextLevel)
        } else {
            val gameOver = Intent(this, GameOver::class.java)
            gameOver.putExtra("gameOver", "Game Over")
            startActivity(gameOver)
        }
    }
}








