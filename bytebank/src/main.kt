import modelo.Diretor
import modelo.Gerente
import teste.CalculadoraBonificacao

fun main() {
    println("Bem vindo ao Bytebanck")
    //testaComportamentoConta()

    val gerente = Gerente("Rodrigo","1111.1111.1111.11", 1000.00, 1234)
    val diretor = Diretor("Gustavo","1111.1111.1111.11", 1000.00, 1234)
    println(gerente.nome)

    val calculadora = CalculadoraBonificacao()
    calculadora.registra(gerente)
    calculadora.registra(diretor)

    println(calculadora.total)


}



