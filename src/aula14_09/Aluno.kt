package aula14_09

class Aluno (var RA : String,nome: String,sobrenome: String) : Pessoa(nome, sobrenome) {
    override fun aula (aula: Aula) {
        println("Assistindo aula ${aula.nome}")
    }

    fun fazerLicao (aula: Aula) {
        println("Fazendo lição de casa da aula ${aula.nome}")
    }

}