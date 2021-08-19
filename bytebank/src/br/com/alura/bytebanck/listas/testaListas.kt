package br.com.alura.bytebanck.listas

import br.com.alura.bytebanck.modelo.Livro

fun main() {

    val livro1 = Livro("Java", "Rodrigo", 2021, "Panini")
    val livro2 = Livro("Brincando de bola", "Gustavo", 2020, "Panini")
    val livro3 = Livro("Angular", "Rodrigo", 2017, "Panini")
    val livro4 = Livro("Administração", "Raquel", 2019, null)

    val livros = mutableListOf(livro1, livro2, livro3, livro4)

    //livros.remove(livro3)

    //livros.imprimeComMarcadores();
    //livros.sorted().imprimeComMarcadores() //sorted() é necessario estender Comparable

   // livros.sortedBy { it.anoPublicacao }.imprimeComMarcadores()

    listaLivros
        .groupBy { it.editora ?: "Editora desconhecida" }
        .forEach { (editora, livros) ->
            println("$editora: ${livros.joinToString { it.titulo }}")
        }

    listaLivros
        .filter { it.autor.startsWith("R") }
        .sortedBy { it.anoPublicacao }
        //.map { it.titulo }
        //.forEach { println(it) }
        .imprimeComMarcadores()

    listaLivrosComNulos.imprimeComMarcadores()

}

fun List<Livro?>.imprimeComMarcadores() {
    val textoFormatado = this
        .filterNotNull()
        .joinToString("\n") {
        " - ${it.titulo} de ${it?.autor} publicado em ${it.anoPublicacao}"
    }
    println(" #### Lista de livros #### \n$textoFormatado")
}