package com.example.diceapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val buttonD6 = findViewById<Button>(R.id.buttonD6)
        val buttonD12 = findViewById<Button>(R.id.buttonD12)
        val buttonD20 = findViewById<Button>(R.id.buttonD20)

        buttonD6.setOnClickListener{
            rolarDados(6)
        }

        buttonD12.setOnClickListener{
            rolarDados(12)
        }

        buttonD20.setOnClickListener{
            rolarDados(20)
        }
    }

    private fun rolarDados(lados: Int) {

        val rolagem = (1..lados).random()

        val textDado = findViewById<TextView>(R.id.textDado)

        textDado.text = rolagem.toString()

        when (lados) {
            6 -> {
                val imageDado = findViewById<ImageView>(R.id.textResultado)

                when (rolagem) {
                    1 -> imageDado.setImageResource(R.drawable.d6_1)
                    2 -> imageDado.setImageResource(R.drawable.d6_2)
                    3 -> imageDado.setImageResource(R.drawable.d6_3)
                    4 -> imageDado.setImageResource(R.drawable.d6_4)
                    5 -> imageDado.setImageResource(R.drawable.d6_5)
                    6 -> imageDado.setImageResource(R.drawable.d6_6)
                }

            }

            12 -> {
                val imageDado = findViewById<ImageView>(R.id.textResultado)

                when (rolagem) {
                    1 -> imageDado.setImageResource(R.drawable.d12_1)
                    2 -> imageDado.setImageResource(R.drawable.d12_2)
                    3 -> imageDado.setImageResource(R.drawable.d12_3)
                    4 -> imageDado.setImageResource(R.drawable.d12_4)
                    5 -> imageDado.setImageResource(R.drawable.d12_5)
                    6 -> imageDado.setImageResource(R.drawable.d12_6)
                    7 -> imageDado.setImageResource(R.drawable.d12_7)
                    8 -> imageDado.setImageResource(R.drawable.d12_8)
                    9 -> imageDado.setImageResource(R.drawable.d12_9)
                    10 -> imageDado.setImageResource(R.drawable.d12_10)
                    11 -> imageDado.setImageResource(R.drawable.d12_11)
                    12 -> imageDado.setImageResource(R.drawable.d12_12)
                }
            }

            20 -> {
                val imageDado = findViewById<ImageView>(R.id.textResultado)

                when (rolagem) {
                    1 -> imageDado.setImageResource(R.drawable.d20_1)
                    2 -> imageDado.setImageResource(R.drawable.d20_2)
                    3 -> imageDado.setImageResource(R.drawable.d20_3)
                    4 -> imageDado.setImageResource(R.drawable.d20_4)
                    5 -> imageDado.setImageResource(R.drawable.d20_5)
                    6 -> imageDado.setImageResource(R.drawable.d20_6)
                    7 -> imageDado.setImageResource(R.drawable.d20_7)
                    8 -> imageDado.setImageResource(R.drawable.d20_8)
                    9 -> imageDado.setImageResource(R.drawable.d20_9)
                    10 -> imageDado.setImageResource(R.drawable.d20_10)
                    11 -> imageDado.setImageResource(R.drawable.d20_11)
                    12 -> imageDado.setImageResource(R.drawable.d20_12)
                    13 -> imageDado.setImageResource(R.drawable.d20_13)
                    14 -> imageDado.setImageResource(R.drawable.d20_14)
                    15 -> imageDado.setImageResource(R.drawable.d20_15)
                    16 -> imageDado.setImageResource(R.drawable.d20_16)
                    17 -> imageDado.setImageResource(R.drawable.d20_17)
                    18 -> imageDado.setImageResource(R.drawable.d20_18)
                    19 -> imageDado.setImageResource(R.drawable.d20_19)
                    20 -> imageDado.setImageResource(R.drawable.d20_20)
                }
            }

        }
    }
}
