package cvs;

import java.util.ArrayList;

public class Curso {

    private String nome;
    private ArrayList<Disciplina> disciplinas;


    public Curso(String nome) {
        this.nome = nome;
        this.disciplinas=new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionarDisciplina ( Disciplina dis){
        this.disciplinas.add(dis);
    }

    public ArrayList<Disciplina> getDisciplinas(){
        return disciplinas;
    }

}
