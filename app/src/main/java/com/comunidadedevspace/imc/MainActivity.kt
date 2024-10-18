package com.comunidadedevspace.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

 // Recuperar os componentes
 // Criar uma variavel e associar o componente de UI <EditText>


 // Colocar ação no botão setOnClickListener
 //  Recuperar o texto digitando no edt peso



        val edtpeso = findViewById<TextInputEditText>(R.id.edt_peso)
        val edtaltura = findViewById<TextInputEditText>(R.id.edt_altura)
        val edtcalcular = findViewById<Button>(R.id.btn_calcular)

        edtcalcular.setOnClickListener{
            val altura = edtaltura.text
            val peso = edtpeso.text
            println("acao do botao" + altura)


        }
    }
}