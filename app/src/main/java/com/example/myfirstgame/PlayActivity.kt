package com.example.myfirstgame
import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_start.*
import kotlin.random.Random

class PlayActivity : AppCompatActivity() {
    var score = 1
    var res = 0
    var rightAnswer=0
    companion object{
        const val COUNT_OF_QUESTION = 10
        const val RIGHT_ANSWERS_COUNT= "rightAnswersCount"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)
        plus()
        timer.start()
    }
    private val timer = object: CountDownTimer(15000,1000){
        override fun onFinish() {
            val gameOver = Intent(this@PlayActivity, GameOver::class.java)
            gameOver.putExtra(RIGHT_ANSWERS_COUNT,rightAnswer)
            startActivity(gameOver)
            finish()
        }
        override fun onTick(mUF: Long) {
            tvTimer.setText("" +mUF/1000).toString()
        }

    }

    override fun onDestroy() {
        super.onDestroy()
        timer.cancel()
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
        if (generalQuestion == res)
        { rightAnswer++
            if (score == COUNT_OF_QUESTION) {
                val winActivity = Intent(this, WinActivity::class.java)
                startActivity(winActivity)
                finish()
            } else {
                score++
                plus()
                timer.start()
                Level.text =("Level: $score").toString()
            }
        } else {
            val gameOver = Intent(this, GameOver::class.java)
            gameOver.putExtra(RIGHT_ANSWERS_COUNT,rightAnswer)
            startActivity(gameOver)
            finish()
        }
    }

}










