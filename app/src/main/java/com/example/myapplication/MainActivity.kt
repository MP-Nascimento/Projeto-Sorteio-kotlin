package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputFilter
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.random.Random


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val numero = findViewById<EditText>(R.id.ext_enunciado)
        numero.filters = arrayOf<InputFilter>(MinMaxFilter(0, 10))
// Codigo Feito para gerar um numero aleatorio na tela com a library Random do Java

        val btnRodarNumero = findViewById<Button>(R.id.btn_Rodar)

        btnRodarNumero.setOnClickListener {
            val texto = findViewById<TextView>(R.id.txt_sorteio)
            val numeroSorteado = Random.nextInt(11)
            val menssagemSorteio = findViewById<TextView>(R.id.txt_msg_sorteio)
            val numeroComparacao = numero.text.toString()



            "Numero Sorteado : $numeroSorteado ".also { texto.text = it }

            if(numeroComparacao == numeroSorteado.toString()){
                "Parabens o numero sorteado bateu com o seu".also { menssagemSorteio.text = it }
            }
            else
            "Poxa não foi dessa vez, mas não desista tente novamente".also { menssagemSorteio.text = it }


        }
    }
}
