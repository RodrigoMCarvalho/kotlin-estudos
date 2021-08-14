import java.util.function.Consumer
import java.util.stream.Collectors

fun main() {
    val lista = listOf("Rodrigo", "Gustavo")
    lista.stream().forEach { e: String? -> println(e) }

    val usuario = Usuario("Raquel", 30)
    val usuarios = mutableListOf<Usuario>(Usuario("Rodrigo", 30), Usuario("Gustavo", 7))
    usuarios.add(usuario)
    usuarios.forEach { e -> println(e.nome) }

    val maiorQueDez = usuarios.stream().filter { u -> u.idade > 10 }.collect(Collectors.toList())
    maiorQueDez.forEach { x -> println("Usuário com 30 anos ou mais: ${x?.nome}")}
}