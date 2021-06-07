package br.senai.sp.jandira.calculadora.gui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import br.senai.sp.jandira.calculadora.R

class ImcActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var btn_masculino: Button
    private lateinit var btn_feminino: Button

    private lateinit var editPeso: EditText
    private lateinit var editAltura: EditText

    private lateinit var buttonSubmit: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imc)

        editPeso = findViewById(R.id.text_peso)
        editAltura = findViewById(R.id.text_altura)

        btn_masculino = findViewById(R.id.button_masculino)
        btn_masculino.setOnClickListener(this)

        btn_feminino =findViewById(R.id.button_feminino)
        btn_feminino.setOnClickListener(this)

        buttonSubmit = findViewById(R.id.button_submit)
        buttonSubmit.setOnClickListener(this)
    }


    override fun onClick(v: View) {
        when (v.id) {
            R.id.button_masculino -> {
                btn_masculino.background = getDrawable(R.drawable.left_redondo2)
                btn_feminino.background = getDrawable(R.drawable.right_redondo)
            }
            R.id.button_feminino -> {
                btn_feminino.background = getDrawable(R.drawable.right_redondo2)
                btn_masculino.background = getDrawable(R.drawable.left_redondo)
            }
            R.id.button_submit -> {
                val abrirActivityresultado = Intent(this, resultado:: class.java)
                abrirActivityresultado.putExtra("text_peso", editPeso.text.toString().toDouble())
                abrirActivityresultado.putExtra("text_altura", editAltura.text.toString().toDouble())
                startActivity(abrirActivityresultado)
            }
        }
    }
}
