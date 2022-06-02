package cvs;

public class Aluno {
    private int nMec;
    private String nome;
    private int idade;

    public Aluno(int nMec, String nome, int idade) {
        this.nMec = nMec;
        this.nome = nome;
        this.idade = idade;
    }

    public int getnMec() {
        return nMec;
    }

    public void setnMec(int nMec) {
        this.nMec = nMec;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
