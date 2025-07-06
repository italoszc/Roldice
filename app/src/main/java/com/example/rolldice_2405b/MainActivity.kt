package com.example.rolldice_2405b

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnd6 = findViewById<Button>(R.id.btnDice)

        btnd6.setOnClickListener {
            rolldice(6)
        }
    }

    private fun rolldice(lados: Int) {
        //Criar a função de numeros aleatórios
        val roll = (1..lados).random()

        //conectar o texto do layout com o código
        val txtResultado = findViewById<TextView>(R.id.txtDice)
        //Criar o texto mostrando o resultado
        txtResultado.text = "D$lados - $roll"

        //Pegar a imagem para configurar ela
        val Imagem = findViewById<ImageView>(R.id.DiceImage)

        //Verificar o estado da função de rolagem e colocar uma imagem
        when(roll){
            1 -> Imagem.setImageResource(R.drawable.dice_1)
            2 -> Imagem.setImageResource(R.drawable.dice_2)
            3 -> Imagem.setImageResource(R.drawable.dice_3)
            4 -> Imagem.setImageResource(R.drawable.dice_4)
            5 -> Imagem.setImageResource(R.drawable.dice_5)
            6 -> Imagem.setImageResource(R.drawable.dice_6)
        }
    }
}







