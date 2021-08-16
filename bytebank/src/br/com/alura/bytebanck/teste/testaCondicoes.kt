
private fun testaCondicoes(saldo: Double) {
    when {
        saldo > 0.0 -> println("br.com.alura.bytebanck.modelo.Conta é positiva")
        saldo == 0.0 -> println("br.com.alura.bytebanck.modelo.Conta neutra")
        else -> println("br.com.alura.bytebanck.modelo.Conta negativa")
    }
}
