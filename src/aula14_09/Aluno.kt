package br.digital.com.Revisao

class Aluno (var RA : String) : Pessoa() {
    override fun aula () {
        println("Assistindo aula.")
    }

    fun fazerLicao () {
        println("Fazendo lição de casa.")
    }
}