
private fun testaCondicoes(saldo: Double) {
    when {
        saldo > 0.0 -> println("Conta é positiva")
        saldo == 0.0 -> println("Conta neutra")
        else -> println("Conta negativa")
    }
}
