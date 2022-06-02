package cvs;

import java.util.ArrayList;

public class Turma {

    private int numero;
    private ArrayList<Aluno> alunos;

    public Turma(int numero) {
        this.numero = numero;
        this.alunos=new ArrayList<>();
    }
}
