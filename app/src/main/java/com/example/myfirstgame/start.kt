package com.example.myfirstgame
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_game_over.*
import kotlinx.android.synthetic.main.activity_start.*
import kotlin.random.Random

class start : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)
        var x = Random.nextInt(1, 4)
            when (x) {
                1 -> plus()
                2 -> minus()
                3 -> div()
                else -> {
                    multiply()
                }
            }

    }
        fun plus() {
            var a = Random.nextInt(0, 99)
            var b = Random.nextInt(0, 99)
            var c = Random.nextInt(1, 4)
            var d = Random.nextInt(5, 9)
            var e = Random.nextInt(10, 12)
            val result = a + b
            btn1.text = result.toString()
            tv.text = "$a+$b"
            c += result
            d += result
            e += result
            btn2.text = e.toString()
            btn3.text = d.toString()
            btn4.text = c.toString()
            btn1.setOnClickListener {
                val NextLevel = Intent(this, start::class.java)
                startActivity(NextLevel)
            }
            btn2.setOnClickListener {
                val GameOver= Intent(this, GameOver::class.java )
                GameOver.putExtra("GameOver","GAME OVER")
                startActivity(GameOver)
            }
            btn3.setOnClickListener {
                val GameOver= Intent(this, GameOver::class.java )
                GameOver.putExtra("GameOver","GAME OVER")
                startActivity(GameOver)
            }
            btn4.setOnClickListener {
                val GameOver= Intent(this, GameOver::class.java )
                GameOver.putExtra("GameOver","GAME OVER")
                startActivity(GameOver)
            }
            }

        fun minus() {
            var a = Random.nextInt(0, 99)
            var b = Random.nextInt(0, 99)
            var c = Random.nextInt(1, 4)
            var d = Random.nextInt(5, 9)
            var e = Random.nextInt(10, 12)
            val result = a - b
            btn2.text = result.toString()
            tv.text = "$a-$b"
            c += result
            d += result
            e += result
            btn1.text = e.toString()
            btn3.text = c.toString()
            btn4.text = d.toString()
            btn2.setOnClickListener {
                val NextLevel = Intent(this, start::class.java)
                startActivity(NextLevel)
            }
            btn1.setOnClickListener {
                val GameOver= Intent(this, GameOver::class.java )
                GameOver.putExtra("GameOver","GAME OVER")
                startActivity(GameOver)
            }
            btn3.setOnClickListener {
                val GameOver= Intent(this, GameOver::class.java )
                GameOver.putExtra("GameOver","GAME OVER")
                startActivity(GameOver)
            }
            btn4.setOnClickListener {
                val GameOver= Intent(this, GameOver::class.java )
                GameOver.putExtra("GameOver","GAME OVER")
                startActivity(GameOver)
            }
            }

        fun div() {
            var a = Random.nextInt(0, 99)
            var b = Random.nextInt(0, 99)
            var c = Random.nextInt(1, 4)
            var d = Random.nextInt(5, 9)
            var e = Random.nextInt(10, 12)
            val result = a / b
            btn3.text = result.toString()
            tv.text = "$a/$b"
            c += result
            d += result
            e += result
            btn1.text = d.toString()
            btn2.text = e.toString()
            btn4.text = c.toString()
            btn3.setOnClickListener {
                val NextLevel = Intent(this, start::class.java)
                startActivity(NextLevel)
            }
            btn2.setOnClickListener {
                val GameOver= Intent(this, GameOver::class.java )
                GameOver.putExtra("GameOver","GAME OVER")
                startActivity(GameOver)
            }
            btn1.setOnClickListener {
                val GameOver= Intent(this, GameOver::class.java )
                GameOver.putExtra("GameOver","GAME OVER")
                startActivity(GameOver)
            }
            btn4.setOnClickListener {
                val GameOver= Intent(this, GameOver::class.java )
                GameOver.putExtra("GameOver","GAME OVER")
                startActivity(GameOver)
            }
        }

        fun multiply() {
            var a = Random.nextInt(0, 99)
            var b = Random.nextInt(0, 99)
            var c = Random.nextInt(1, 4)
            var d = Random.nextInt(5, 9)
            var e = Random.nextInt(10, 12)
            val result = a * b
            btn4.text = result.toString()
            tv.text = "$a*$b"
            c += result
            d += result
            e += result
            btn1.text = d.toString()
            btn3.text = c.toString()
            btn2.text = e.toString()
            btn4.setOnClickListener {
                val NextLevel = Intent(this, start::class.java)
                startActivity(NextLevel)
            }
            btn2.setOnClickListener {
                val GameOver= Intent(this, GameOver::class.java )
                GameOver.putExtra("GameOver","GAME OVER")
                startActivity(GameOver)
            }
            btn3.setOnClickListener {
                val GameOver= Intent(this, GameOver::class.java )
                GameOver.putExtra("GameOver","GAME OVER")
                startActivity(GameOver)
            }
            btn1.setOnClickListener {
                val GameOver= Intent(this, GameOver::class.java )
                GameOver.putExtra("GameOver","GAME OVER")
                startActivity(GameOver)
            }
        }
    }

