package br.com.alura.bytebanck.listas

import br.com.alura.bytebanck.modelo.Livro

val listaLivros = mutableListOf(
         Livro("Java", "Rodrigo", 2021, "Editora A"),
         Livro("Brincando de bola", "Gustavo", 2020, "Editora A"),
         Livro("Angular", "Rodrigo", 2017, "Editora A"),
         Livro("Administração", "Raquel", 2019, null),
         Livro("Livro da vida", "Alberto", 1999, "Editora A"),
         Livro("Vasco da gama", "Edmundo", 1997, "Panini"),
         Livro("Inglaterra", "Mike", 2005, "Editora A"),
         Livro("Guerra dos samurais", "Ryuu Sato", 1883, null),
         Livro("Livro dos 5 aneis", "Mushasi", 1662, "Panini"),
         Livro("Crime e Castigo", "Fulano", 1909, "Panini"),
         Livro("Se aceite", "Ciclano", 2014, "Editora B"),
         Livro("Faça isso", "Beltrano", 2022, "Editora B")
    )


val listaLivrosComNulos: MutableList<Livro?> = mutableListOf(
    Livro("Java", "Rodrigo", 2021, "Panini"),
    null,
    Livro("Brincando de bola", "Gustavo", 2020, "Panini"),
    Livro("Angular", "Rodrigo", 2017, "Panini"),
    Livro("Administração", "Raquel", 2019, null),
    Livro("Livro da vida", "Alberto", 1999, "Panini"),
    Livro("Vasco da gama", "Edmundo", 1997, "Panini"),
    Livro("Inglaterra", "Mike", 2005, "Panini"),
    null,
    Livro("Guerra dos samurais", "Ryuu Sato", 1883, null),
    Livro("Livro dos 5 aneis", "Mushasi", 1662, "Panini"),
    Livro("Crime e Castigo", "Fulano", 1909, "Panini"),
    Livro("Se aceite", "Ciclano", 2014, null),
    Livro("Faça isso", "Beltrano", 2022, "Panini")
)