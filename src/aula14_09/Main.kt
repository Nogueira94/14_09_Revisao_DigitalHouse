package aula14_09

fun main(){

    var professorA = Professor ("123456A", "João", "Augusto")
    var professorB = Professor ("12345B", "Luiz", "Antonio")

    var alunoA = Aluno ("111", "Pedro", "A")
    var alunoB = Aluno ("222", "Paulo", "A")

    var aulaA = Aula("Matematica", "18:40", "23:00")
    var aulaB = Aula("Portugues", "19:20", "23:00")

    var cursoA= Curso("Ensino Medio", professorA)

    var turma1 = Turma("1 A", cursoA)

    cursoA.addAula(aulaA,aulaB)
    cursoA.addAluno(alunoA,alunoB)

    cursoA.alunosCurso();
    cursoA.aulasCurso();

    professorA.fazerChamada(aulaA);



}