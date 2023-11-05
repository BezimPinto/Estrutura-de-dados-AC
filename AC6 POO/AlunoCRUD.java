

import java.util.HashMap;
import java.util.Map;

public class AlunoCRUD {
    private Map<String, Aluno> alunos;

    public AlunoCRUD() {
        alunos = new HashMap<>();
    }

    public void addAluno(String mat, String nome, String curso) {
        Aluno aluno = new Aluno(mat, nome, curso);
        alunos.put(mat, aluno);
    }

    public void removerAluno(String matricula) {
        alunos.remove(matricula);
    }

    public void attCurso(String matricula, String novoCurso) {
        if (alunos.containsKey(matricula)) {
            Aluno aluno = alunos.get(matricula);
            aluno.setCurso(novoCurso);
        } else {
            System.out.println("Aluno de matrícula " + matricula + " não encontrado.");
        }
    }

    public Aluno buscarAluno(String matricula) {
        return alunos.get(matricula);
    }

    public void listarAlunos() {
        for (Aluno aluno : alunos.values()) {
            System.out.println(aluno.toString());
        }
    }

    public Aluno[] getAlunos() {
        return null;
    }
}