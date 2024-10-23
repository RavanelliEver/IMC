package com.comunidadedevspace.imc

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

const val KEY_RESULT_IMC = "ResultActivity2.KEY_IMC"

class ResultActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_result2)


        val result = intent.getFloatExtra(KEY_RESULT_IMC, 0.1f)
        val tvresult = findViewById<TextView>(R.id.tv_result)
        val tvclassificacao = findViewById<TextView>(R.id.tv_classificacao)
        tvresult.text = result.toString()

        val (classification, color) = when {
result < 18.5f ->"MAGREZA" to R.color.red
result > 18.5f && result <= 24.9f -> "NORMAL" to R. color.Green
result > 25.0f && result <= 29.9f -> "SOBREPESO" to R.color.Yellow
result > 30f && result <= 39.9f -> "OBESO" to R.color.Orange
else -> "OBESIDADE MORBIDA" to R.color.red
  }


  tvclassificacao.text = classification
 tvclassificacao.setTextColor(ContextCompat.getColor(this, color))

    }
}