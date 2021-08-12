
class Conta(val titular: String, val numero: Int) {
    var saldo = 0.0
        private set

    fun deposita(valor: Double) {
        if (valor > 0) {
            println("Depositando na conta do $titular o valor de $valor")
            saldo += valor
        }
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

    fun transfere(valor: Double, destino: Conta) {
        if (saldo < valor) {
            println("Saldo insuficiente na conta de $titular")
        } else {
            println("Transferindo da conta do $titular para ${destino.titular} o valor de $valor")
            saldo -= valor
            destino.deposita(valor);
        }
    }

    override fun toString(): String {
        return "Conta(titular='$titular', numero=$numero, saldo=$saldo)"
    }



}