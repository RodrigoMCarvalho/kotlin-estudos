package br.com.alura.bytebanck.teste

import br.com.alura.bytebanck.modelo.Cliente
import br.com.alura.bytebanck.modelo.Conta

fun testaComportamentoConta() {
    //testarLacos()
    //testaCondicoes(saldo)

    val cliente1 = Cliente("Rodrigo", "122222", 111111)
    val conta1 = Conta(cliente1, 1000)
    conta1.deposita(30.0)

    val cliente2 = Cliente("Gustavo", "5666666", 111111)
    val conta2 = Conta(titular = cliente2, numero = 1001)
    conta2.deposita(50.0)

    println(conta1.toString())
    println(conta2.toString())

//    conta1.saca( 150.0)
//    conta2.saca(500.0)

    conta1.transfere(10.0, conta2)

    println(conta1.toString())
    println(conta2.toString())
}
