package br.com.alura.bytebanck.listas

import br.com.alura.bytebanck.modelo.Prateleira

fun main() {
    val prateleira = Prateleira("Literatura", listaLivros)

    val porAutor = prateleira.organizarPorAutor()
    val porAno = prateleira.organizarPorAnoPublicado()
    val porTitulo = prateleira.organizarPorTitulo()

    porAutor.imprimeComMarcadores()
    porAno.imprimeComMarcadores()
    porTitulo.imprimeComMarcadores()

}