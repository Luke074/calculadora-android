package br.senai.sp.jandira.calculadora.gui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import br.senai.sp.jandira.calculadora.R

class splash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler(Looper.getMainLooper()).postDelayed({
            val abrirActivityMain = Intent(this, MenuActivity::class.java)
            startActivity(abrirActivityMain)
            finish()

        }, 3000 )
    }
}