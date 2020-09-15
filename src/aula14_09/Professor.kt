package aula14_09

class Professor (var RD: String,nome: String,sobrenome: String) : Pessoa(nome, sobrenome) {

    override fun aula (aula: Aula) {
        println("Apresentando a aula ${aula.nome}.")
    }

    fun fazerChamada (aula : Aula) {
        println("Fazendo chamada da aula ${aula.nome}.")
    }
}