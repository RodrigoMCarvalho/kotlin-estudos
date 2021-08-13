import java.util.*
import java.util.function.Consumer
import java.util.stream.Collectors

fun main() {
    val lista = Arrays.asList("Rodrigo", "Gustavo")
    lista.stream().forEach { e: String? -> println(e) }

    val usuarios = Arrays.asList(Usuario("Rodrigo", 30), Usuario("Gustavo", 7))
    usuarios.stream().forEach { e: Usuario -> println(e.nome) }

    val maiorQueDez = usuarios.stream().filter { u: Usuario -> u.idade > 10 }.collect(Collectors.toList())
    maiorQueDez.forEach(Consumer { x: Usuario? -> println(x?.idade) })
}