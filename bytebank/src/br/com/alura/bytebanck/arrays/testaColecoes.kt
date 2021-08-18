package br.com.alura.bytebanck.teste

fun main() {
    val idades: IntArray = intArrayOf(25, 19, 33, 88, 55, 40)

    var menorIdade = Int.MAX_VALUE
    idades.forEach { idade ->
        if (idade < menorIdade) {
            menorIdade = idade
        }
    }
    //println(menorIdade)
    val idades2 = intArrayOf(25, 19, 33, 88, 55, 40, 67, 12)
    println("Maior idade: ${idades2.max()}")
    println("Menor idade: ${idades2.min()}")
    println("Media: ${idades2.average()}")

    val todosMaiores = idades2.all { it >= 18 }
    println("Todos maiores de idade? $todosMaiores")

    val existeMaior = idades2.any { it >= 18 }
    println("Algum maior de idade? $existeMaior")

    val maioresIdade = idades2.filter { it >= 18 }
    println("Maiores: $maioresIdade")

    val busca = idades2.find { it == 67 }
    println(busca)



    val salarios: DoubleArray = doubleArrayOf(2500.0, 1900.0, 3300.0, 8850.0, 5500.0, 4000.0)
    val aumento = 1.1

//    for (indice in salarios.indices) {
//        salarios[indice] = salarios[indice] * aumento
//    }
//    println(salarios.contentToString())

    salarios.forEachIndexed { index, salario ->  salarios[index] = salario * aumento}
    println(salarios.contentToString())

    val serie: IntRange = 1.rangeTo(10)
    serie.forEach { print(it) }

    val numerosPares = 2.until(100) step 2
    numerosPares.forEach { print("$it ") }
    println()

    val intervalo = 1500.0..5000.0
    val salario = 6000.0
    if (salario in intervalo) {
        println("Está dentro do intervalo")
    } else {
        println("Não está dentro do intervalo")
    }

    val alfabeto = 'a'..'z' //Somente letras minusculas
    val letra = 'B'
    println(letra in alfabeto)






}