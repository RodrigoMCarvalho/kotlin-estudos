package br.com.alura.bytebanck.modelo

data class Prateleira(
    val genero: String,
    var livros: List<Livro>
) {
    fun organizarPorAutor(): List<Livro> {
        return livros.sortedBy { it.autor }
    }

    fun organizarPorAnoPublicado(): List<Livro> {
        return livros.sortedBy { it.anoPublicacao }
    }

    fun organizarPorTitulo(): List<Livro> {
        return livros.sortedBy { it.titulo }
    }
}