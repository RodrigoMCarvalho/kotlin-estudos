import br.com.alura.bytebanck.modelo.Diretor
import br.com.alura.bytebanck.modelo.Gerente
import br.com.alura.bytebanck.modelo.CalculadoraBonificacao
import br.com.alura.bytebanck.teste.testaComportamentoConta

fun main() {
    println("Bem vindo ao Bytebanck")
    testaComportamentoConta()

    val gerente = Gerente("Rodrigo","1111.1111.1111.11", 1000.00, 1234)
    val diretor = Diretor("Gustavo","1111.1111.1111.11", 1000.00, 1234)
    //println(gerente.nome)

    val calculadora = CalculadoraBonificacao()
    calculadora.registra(gerente)
    calculadora.registra(diretor)
    calculadora.registra(1)

    println(calculadora.total)

    val fran = object {
        val nome: String = "Fran"
        val cpf: String = "12345678"
        val senha: Int = 1000

        fun autentica(senha: Int) = this.senha == senha
    }

    println(fran.nome)


}



