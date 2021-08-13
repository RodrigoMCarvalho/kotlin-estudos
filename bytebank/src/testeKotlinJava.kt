import java.util.function.Consumer
import java.util.stream.Collectors

fun main() {
    val lista = listOf("Rodrigo", "Gustavo")
    lista.stream().forEach { e: String? -> println(e) }

    val usuarios = listOf(Usuario("Rodrigo", 30), Usuario("Gustavo", 7))
    usuarios.forEach { e: Usuario -> println(e.nome) }

    val maiorQueDez = usuarios.stream().filter { u: Usuario -> u.idade > 10 }.collect(Collectors.toList())
    maiorQueDez.forEach { x: Usuario? -> println(x?.idade) }
}