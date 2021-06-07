package br.senai.sp.jandira.calculadora.gui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.senai.sp.jandira.calculadora.R
import kotlinx.android.synthetic.main.activity_n_c_d.*

class NCDActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_n_c_d)

        button_calcularNCD.setOnClickListener{
            spinner_idade.selectedItemId
        }

    }
}