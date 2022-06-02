package cvs;

import java.util.ArrayList;

public class Disciplina {

    private String nome;

    private ArrayList<Turma> turma;

    public Disciplina(String nome) {
        this.nome = nome;
        this.turma=new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionarTurma ( Turma turma){
        this.turma.add(turma);

    }

}
