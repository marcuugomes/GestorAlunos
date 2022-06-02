package cvs;

import java.util.ArrayList;

public class Turma {

    private int numero;
    private ArrayList<Aluno> alunos;
    private Curso curso;

    public Turma(int numero, Curso curso) {
        this.numero = numero;
        this.alunos=new ArrayList<>();
        this.curso=curso;

    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public Curso getCurso() {
        return curso;
    }
    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public void adicionarAluno(Aluno aluno){
        this.alunos.add(aluno);
    }


}
