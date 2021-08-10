
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

    conta1.deposita( 50.0)
    conta2.deposita(130.0)

    println(conta1.toString())
    println(conta2.toString())

    conta1.saca( 150.0)
    conta2.saca(500.0)

    println(conta1.toString())
    println(conta2.toString())





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

class Conta {
    var titular = ""
    var numero = 0
    var saldo = 0.0

    fun deposita(valor: Double) {
        println("Depositando na conta do $titular o valor de $valor")
        saldo += valor
    }

    fun saca(valor: Double) {
        when {
            saldo < valor -> println("Saldo insuficiente na conta de $titular")
            else -> {
                println("Sacando na conta do $titular o valor de $valor")
                saldo -= valor
            }
        }
    }

    override fun toString(): String {
        return "Conta(titular='$titular', numero=$numero, saldo=$saldo)"
    }

}
