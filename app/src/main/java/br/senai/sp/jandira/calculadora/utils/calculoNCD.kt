package br.senai.sp.jandira.calculadora.utils

var _idade: Int = 0
var _sexo: String = ""
var _nivel: String = ""
var _peso: Double = 0.0

fun calcularNCD(
    sexo:String,
    idade: Int,
    nivel:String,
    peso:Double) :Double{

    _idade = idade
    _sexo = sexo
    _nivel = nivel
    _peso = peso

    if(sexo == "F"){
        return ncdFeminino()
    } else {
        return ncdMasculino()
    }

}

fun ncdFeminino(): Double{
    if (_idade == 1){
        return 14.7 * _peso + 496
    } else if (_idade == 2){
        return 8.7 * _peso + 829
    }else{
        return 10.5 * _peso + 596
    }


}

fun ncdMasculino(): Double{
    if (_idade == 1){
        return 15.3 * _peso + 679
    } else if (_idade == 2){
        return 11.6 * _peso + 829
    }else{
        return 13.5 * _peso + 487
    }

}