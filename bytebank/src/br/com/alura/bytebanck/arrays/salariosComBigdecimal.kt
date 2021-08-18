package br.com.alura.bytebanck.arrays

import java.math.BigDecimal
import java.math.RoundingMode

fun main() {
    val salarios = bigDecimalArrayOf("5000.55", "4222.00", "13550.00", "3500.00", "1800.00", "6500.00")

    val aumento = "1.1".toBigDecimal()
    val salariosComAumento = salarios
                                .map { salario -> calculaAumentoRelativo(salario, aumento) }
                                .toTypedArray()

    println(salarios.contentToString())
    println(salariosComAumento.contentToString())
    println(salarios.somatorio())

    val meses = 6.toBigDecimal()
    val gastoTotal = salariosComAumento.fold(salarios.somatorio()) { acumaldor, salario ->
        acumaldor + (salario * meses).setScale(2, RoundingMode.UP)
    }
    println("Gasto Total: $gastoTotal")

    val tresMaioresSalarios = salariosComAumento.sorted()
                                                .takeLast(3)
                                                .toTypedArray()
    println(tresMaioresSalarios.contentToString())
    println(tresMaioresSalarios.media())

    val tresMenoresSalarios = salariosComAumento.sorted()
                                                .take(3)
                                                .toTypedArray()
    println(tresMenoresSalarios.contentToString())
    println(tresMenoresSalarios.media())


}

private fun calculaAumentoRelativo(
    salario: BigDecimal,
    aumento: BigDecimal
) = if (salario > "5000".toBigDecimal()) {
    (salario * aumento).setScale(2, RoundingMode.UP)
} else {
    salario + "500".toBigDecimal()
}

fun bigDecimalArrayOf(vararg valores: String) : Array<BigDecimal> {
    return Array(valores.size) { index ->
        valores[index].toBigDecimal()
    }
}

fun Array<BigDecimal>.somatorio(): BigDecimal {
   return this.reduce { acumulador, valor -> acumulador + valor }
}

fun Array<BigDecimal>.media(): BigDecimal {
    return if (this.isEmpty()) {
        BigDecimal.ZERO
    } else {
        this.somatorio() / this.size.toBigDecimal()
    }
}

