package cvs;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;

public class main {
    public static void main(String[] args) {

        // Criar 6 Alunos
        Aluno aluno1 = new Aluno(109138,"Jonathan",21);
        Aluno aluno2 = new Aluno(101010, "Tiago", 21);
        Aluno aluno3 = new Aluno(101011, "Ângelo", 51);
        Aluno aluno4 = new Aluno(101012, "Simão", 31);
        Aluno aluno5 = new Aluno(101013, "Débora", 26);
        Aluno aluno6 = new Aluno(101014, "Aléxio", 90);


        // Criar 2 Cursos s/ disciplinas associadas
        Curso curso1 = new Curso("Programação");
        Curso curso2 = new Curso("Mecânica");


        // Criar 4 disciplinas s/ turmas associadas
        Disciplina dis1 = new Disciplina("Matemática");
        Disciplina dis2 = new Disciplina("Português");
        Disciplina dis3 = new Disciplina("Inglês");
        Disciplina dis4 = new Disciplina("JavaScript");

        // Criar 2 turmas s/ alunos e associar a um curso
        Turma turma1 = new Turma(1, curso1);
        Turma turma2 = new Turma(2, curso2);


        // ASSOCIAR ALUNOS A TURMAS;
        turma1.adicionarAluno(aluno1);
        turma1.adicionarAluno(aluno2);
        turma1.adicionarAluno(aluno3);
        turma2.adicionarAluno(aluno4);
        turma2.adicionarAluno(aluno5);
        turma2.adicionarAluno(aluno6);

        //ASSOCIAR DISCIPLINAS A CADA CURSO
        curso1.adicionarDisciplina(dis1);
        curso1.adicionarDisciplina(dis4);
        curso2.adicionarDisciplina(dis2);
        curso2.adicionarDisciplina(dis3);

        //ASSOCIAR TURMAS A DISCIPLINAS
        dis1.adicionarTurma(turma1);
        dis2.adicionarTurma(turma1);
        dis3.adicionarTurma(turma2);
        dis4.adicionarTurma(turma2);


        // ESCRITA P/ FICHEIRO CVS
        try {
            FileWriter csvWriter = new FileWriter("escola.csv");
            csvWriter.append("Turma, Curso");
            csvWriter.append("\n");
            csvWriter.append("Turma "+turma1.getNumero()+","+turma1.getCurso().getNome());
            csvWriter.append("\n");
            csvWriter.append("Turma "+turma2.getNumero()+","+turma2.getCurso().getNome());
            csvWriter.flush();
            csvWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try{
            FileWriter csvWriter1 = new FileWriter("curso.csv");
            csvWriter1.append("Curso, Disciplinas"+"\n");
            csvWriter1.append(curso1.getNome()+",");
            for(int i=0;i<curso1.getDisciplinas().size();i++){
                csvWriter1.append(curso1.getDisciplinas().get(i).getNome()+",");
            }
            csvWriter1.append("\n");
            csvWriter1.append(curso2.getNome()+",");
            for(int i=0;i<curso2.getDisciplinas().size();i++){
                csvWriter1.append(curso2.getDisciplinas().get(i).getNome()+",");
            }
            csvWriter1.flush();
            csvWriter1.close();


        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
