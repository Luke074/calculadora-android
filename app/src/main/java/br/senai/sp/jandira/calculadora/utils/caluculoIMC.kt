package br.senai.sp.jandira.calculadora.utils

import br.senai.sp.jandira.calculadora.repository.Frases
import java.text.DecimalFormat
import java.util.*

fun calcularImc(peso: Double, altura: Double) : Array<String>{
    val imc = peso / Math.pow(altura, 2.0)
    val status = obterStatus(imc)

    return arrayOf(formatarDouble(imc), status, obterFrases(status))
}

fun obterFrases(status: String): String {
    var tamanho= 0

     if (status == "Peso Ideal") {
         tamanho = Frases.frasesIdeais.size
        return Frases.frasesIdeais[Random().nextInt(tamanho)]
    } else {
         tamanho = Frases.frasesNaoIdeais.size
         return Frases.frasesNaoIdeais[Random().nextInt(tamanho)]
    }
}

fun formatarDouble(valor: Double) : String{
    val df = DecimalFormat("##,###.0")
    return df.format(valor)
}

fun obterStatus(imc: Double) : String{
    if (imc < 18.5) {
        return "Abaixo do peso!"
    }
    else if (imc >= 18.5 && imc < 25){
        return "Peso Ideal"
    }
    else if(imc >= 25 && imc < 30){
        return "Levemente acima do Peso"
    }
    else if (imc >= 30 && imc <35){
        return "obesidade grau I"
    }
    else if (imc >= 35 && imc < 40){
        return "obesidade grau II"
    }
    else{
        return "obesidade grau III"
    }
}