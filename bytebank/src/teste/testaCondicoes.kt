
private fun testaCondicoes(saldo: Double) {
    when {
        saldo > 0.0 -> println("modelo.Conta é positiva")
        saldo == 0.0 -> println("modelo.Conta neutra")
        else -> println("modelo.Conta negativa")
    }
}
