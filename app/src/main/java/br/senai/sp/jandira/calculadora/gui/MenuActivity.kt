package br.senai.sp.jandira.calculadora.gui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.cardview.widget.CardView
import br.senai.sp.jandira.calculadora.R

class MenuActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var cardIMC: CardView
    private lateinit var cardNCD: CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        cardIMC = findViewById(R.id.card_imc)
        cardIMC.setOnClickListener(this)

        cardNCD = findViewById(R.id.card_ncd)
        cardNCD.setOnClickListener(this)
    }

    override fun onClick(v: View) {

        if (v.id == R.id.card_imc) {
            val intentIMC = Intent(this, ImcActivity::class.java)
            startActivity(intentIMC)
        }else if(v.id == R.id.card_ncd) {
            val intentNCD = Intent(this, NCDActivity::class.java)
            startActivity(intentNCD)
        }else {
            Toast.makeText(this, "Nada foi clicado", Toast.LENGTH_SHORT).show()
        }
    }
}