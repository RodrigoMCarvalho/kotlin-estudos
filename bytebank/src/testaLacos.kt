
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
