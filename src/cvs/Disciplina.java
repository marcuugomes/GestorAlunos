package cvs;

import java.util.ArrayList;

public class Disciplina {

    private String nome;

    private ArrayList<Turma> turmas;

    public Disciplina(String nome) {
        this.nome = nome;
        this.turmas=new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
