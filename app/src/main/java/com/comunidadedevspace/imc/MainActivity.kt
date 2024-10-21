package com.comunidadedevspace.imc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.snackbar.Snackbar
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
            val alturaStr: String = edtaltura.text.toString()
            val pesoStr: String = edtpeso.text.toString()

            if (pesoStr == "" || alturaStr == ""){

            // Mostrar mensagem para o usuario
            Snackbar
            .make(
            edtpeso,
            "Preencha todos os campos",
            Snackbar.LENGTH_LONG
              )
              .show()

            } else{

            val peso = pesoStr.toFloat()
            val altura = alturaStr.toFloat()

            val alturaQ2 = altura * altura
            val resultado = peso / alturaQ2


            // Navegar para a proxima tela
            // Criar o layout da proima tela
            // Passar dados (Resultado) para a proxima tela
            // Intent - classe do proprio Android

           val intent = Intent(this, ResultActivity2::class.java)
           intent.putExtra(KEY_RESULT_IMC, resultado)
           startActivity(intent)

           println("Ravanelli acao do botao" + resultado)

            }

        }
    }
}