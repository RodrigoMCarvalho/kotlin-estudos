package br.com.alura.bytebanck.modelo

class Conta(
    val titular: Cliente,
    val numero: Int
    ) {
    var saldo = 0.0
        private set

    fun deposita(valor: Double) {
        if (valor > 0) {
            println("Depositando na conta do ${titular.nome} o valor de $valor")
            saldo += valor
        }
    }

    fun saca(valor: Double) {
        if (saldo < valor) println("Saldo insuficiente na conta de ${titular.nome}")
        else {
            println("Sacando na conta do ${titular.nome} o valor de $valor")
            saldo -= valor
        }
    }

    fun transfere(valor: Double, destino: Conta) {
        if (saldo < valor) {
            println("Saldo insuficiente na conta de ${titular.nome}")
        } else {
            println("Transferindo da conta do ${titular.nome} para ${destino.titular.nome} o valor de $valor")
            saldo -= valor
            destino.deposita(valor);
        }
    }

    override fun toString(): String {
        return "Conta(titular='${titular.nome}', numero=$numero, saldo=$saldo)"
    }



}