package br.com.digitalhouse.olamundo

fun main() {
    print("Olá ")
    //Mostra no terminal
    println(mostrarMeuNome( sobrenome = "Santini",idade = 20 ))
    println(alunosDeAndroid())
    println("-------------------------------------------")
    println("              LISTA DE ALUNOS              ")
    println("-------------------------------------------")
    println(alunosDeAndroid())

//    for (nome in 0 .. alunosDeAndroid().size) {
//        println("Nome do aluno: ${alunosDeAndroid()[nome]}")
//    }

    for(nome in alunosDeAndroid()) {
        println(nome)
    }
}

fun mostrarMeuNome(sobrenome : String, idade : Int): String {

    val idadeRecebida= when(idade) {
        18 -> "Tem 18 anos"
        20 -> "Tem 20 anos"
        30 -> "Tem 30 anos"
        else -> "Tem alguns anos"
    }

    return "Yuri $sobrenome que $idadeRecebida "
}

fun alunosDeAndroid(): ArrayList<String> {
    val listaAlunos = arrayListOf<String>()
    listaAlunos.add("Wagner")
    listaAlunos.add("Vitória")
    listaAlunos.add("Jéssica")
    listaAlunos.add("Yuri")
    listaAlunos.add("Leo")
    listaAlunos.add("Tajuba")

    return listaAlunos
}



