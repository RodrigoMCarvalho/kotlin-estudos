import java.util.stream.Collectors

fun main() {
    val lista = listOf("Rodrigo", "Gustavo")
    lista.stream().forEach { println(it) }

    val usuario = Usuario("Raquel", 30)
    val usuarios = mutableListOf(Usuario("Rodrigo", 30), Usuario("Gustavo", 7))
    usuarios.add(usuario)
    usuarios.forEach { println(it.nome) }

    val maiorQueDez = usuarios.stream().filter { it.idade > 40 }.collect(Collectors.toList())
    maiorQueDez.forEach { println("Usuário com 30 anos ou mais: ${ it.nome }")}

    val frutas = listOf("banana", "laranja", "pêra", "uva", "ameixa")
    val novaLista = frutas
                        .map { it.toUpperCase() }
                        .sortedBy { it }
                        //.forEach { println(it) }

    novaLista.forEach { println(it) }
}