package br.com.alura.bytebanck.modelo
class Diretor(nome: String,
              cpf: String,
              salario: Double,
              val senha: Int
) : Funcionario(nome, cpf, salario) {

    override val bonificacao: Double = salario * 0.3

    fun autentica(senha: Int) : Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }

}