package br.com.digitalhouse.Exercicios

fun main() {

    println("-------------Exercícios-------------")
    println("------------------------------------")
    println(exercicio1(50,2,3))
    println("------------------------------------")
    println(exercicio2("oi","oi"))
    println(exercicio2("oi","olá"))
    println("------------------------------------")
    println(exercicio3(2))
    println(exercicio3(3))
    println("------------------------------------")
    println(exercicio4())
    println("------------------------------------")
    println(exercicio5(1,2,3,4))
    println(exercicio5(4,1,2,1))
    println("------------------------------------")
    println(exercicio6())

}

fun exercicio1(num1: Int,num2: Int,num3: Int): Int {
    var maior = num1
    if((num2 > num1) && (num2>num3)) {
        maior = num2
    }
    else if((num3 > num1) && (num3 > num2)) {
        maior = num3
    }

    return maior
}

fun exercicio2(string1: String,string2: String) : String {
    if (string1 == string2) {
        return "True"
    }
    else
        return "False"
}

fun exercicio3(num: Int) : String {
    if (num%2 == 0) {
        return "True"
    }
    else
        return "False"
}

fun exercicio4() {
    for (i in 0 .. 100) {
        if(i % 2 != 0) {
            println(i)
        }
    }
}

fun exercicio5(numA: Int,numB: Int,numC: Int,numD: Int): String {
    if(((numA > numC)&&(numA > numD)) || ((numB > numC)&&(numB > numD))) {
        return "True"
    }
    else
        return "False"
}

fun exercicio6() {
    for (i in 0 .. 100) {
        println(i)
    }
}