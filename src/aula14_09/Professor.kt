package br.digital.com.Revisao

class Professor (var RD: String) : Pessoa () {

    override fun aula () {
        println("Apresentando a aula.")
    }

    fun fazerChamada () {
        println("Fazendo chamada.")
    }
}