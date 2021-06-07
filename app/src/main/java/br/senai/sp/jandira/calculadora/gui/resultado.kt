package br.senai.sp.jandira.calculadora.gui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import br.senai.sp.jandira.calculadora.R
import br.senai.sp.jandira.calculadora.utils.calcularImc

class resultado : AppCompatActivity() {

    private lateinit var textViewResutado : TextView
    private lateinit var textViewStatus : TextView
    private lateinit var textViewMensagem: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculo)

        textViewResutado = findViewById(R.id.resultado_valor)
        textViewStatus = findViewById(R.id.resultado_status)
        textViewMensagem = findViewById(R.id.resultado_mensagem)

        exibirResultado()
    }

    private fun exibirResultado(){
        val resultado = calcularImc(
            intent.getDoubleExtra("text_peso", 0.0),
            intent.getDoubleExtra("text_altura", 0.0)
        )
        textViewResutado.text = resultado[0]
        textViewStatus.text = resultado[1]
        textViewMensagem.text = resultado[2]

    }
}