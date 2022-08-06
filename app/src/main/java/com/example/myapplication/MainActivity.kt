package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnRodarNumero = findViewById<Button>(R.id.btn_Rodar)

        btnRodarNumero.setOnClickListener{
            val texto = findViewById<TextView>(R.id.txt_sorteio)
            val numeroSorteado = Random().nextInt(11)

            "Numero sorteado é: $numeroSorteado".also { texto.text = it }
        }
    }
}