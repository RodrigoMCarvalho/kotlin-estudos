package br.com.alura.bytebanck.modelo
abstract class Funcionario(
        val nome: String,
        val cpf: String,
        val salario: Double
) {

    open val bonificacao: Double = salario * 0.1



}