import modelo.Conta

fun testaComportamentoConta() {
    //testarLacos()
    //testaCondicoes(saldo)

    val conta1 = Conta("Rodrigo", 1000)
    conta1.deposita(30.0)

    val conta2 = Conta(titular = "Gustavo", numero = 1001)
    conta2.deposita(50.0)

    println(conta1.toString())
    println(conta2.toString())

//    conta1.saca( 150.0)
//    conta2.saca(500.0)

    conta1.transfere(10.0, conta2);

    println(conta1.toString())
    println(conta2.toString())
}
