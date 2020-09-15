package aula14_09

class Curso (var nome: String,var professor: Professor ){

    var listaDeAula = ArrayList<Aula>();
    var listadeAlunos = ArrayList<Aluno>();

    fun addAula(vararg aula : Aula) = listaDeAula.addAll(aula);
    fun addAluno(vararg aluno : Aluno) = listadeAlunos.addAll(aluno);

    fun aulasCurso(){
        for (obj in listaDeAula){
            println(obj.nome);
        }
    }

    fun alunosCurso(){
        for (obj in listadeAlunos){
            println(obj.nome);
        }
    }

}