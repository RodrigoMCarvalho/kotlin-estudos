
fun main() {
    println("Bem vindo ao Bytebanck")

    //testarLacos()
    //testaCondicoes(saldo)

    val conta1 = Conta()
    conta1.titular = "Rodrigo";
    conta1.numero = 1000
    conta1.saldo = 30.0

    val conta2 = Conta()
    conta2.titular = "Gustavo";
    conta2.numero = 1001
    conta2.saldo = 450.0

    println(conta1.toString())
    println(conta2.toString())

}

class Conta {
    var titular = ""
    var numero = 0
    var saldo = 0.0
    override fun toString(): String {
        return "Conta(titular='$titular', numero=$numero, saldo=$saldo)"
    }

}


private fun testarLacos() {
    for (i in 5 downTo 1) {

        if (i == 4) break

        val titular = "Usuario $i"
        val numeroConta = 10000 + i
        var saldo = i + 10.0

        println("Titular: $titular")
        println("Numero da conta: $numeroConta")
        println("Saldo: $saldo")
        println("===============")
    }
}

private fun testaCondicoes(saldo: Double) {
    when {
        saldo > 0.0 -> println("Conta é positiva")
        saldo == 0.0 -> println("Conta neutra")
        else -> println("Conta negativa")
    }
}
