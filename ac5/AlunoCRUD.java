import java.util.HashMap;
import java.util.Map;

public class AlunoCRUD  {
    private Map<String, Aluno> alunos;

    public AlunoCRUD() {
        alunos = new HashMap<>();
    }

    public void addAluno(String matricula, String nome, String curso) {
        Aluno aluno = new Aluno(matricula, nome, curso);
        alunos.put(matricula, aluno);
    }

    public void removerAluno(String matricula) {
        alunos.remove(matricula);
    }

    public void attCurso(String matricula, String novoCurso) {
        if (alunos.containsKey(matricula)) {
            Aluno aluno = alunos.get(matricula);
            aluno.setCurso(novoCurso);
        } else {
            System.out.println("Aluno com matrícula " + matricula + " não encontrado.");
        }
    }

    public void AlunoMat(String matricula) {
        if (alunos.containsKey(matricula)) {
            Aluno aluno = alunos.get(matricula);
            System.out.println("Matrícula: " + aluno.getMat());
            System.out.println("Nome: " + aluno.getNome());
            System.out.println("Curso: " + aluno.getCurso());
        } else {
            System.out.println("Aluno com matrícula " + matricula + " não encontrado.");
        }
    }

    public void listarAlunos() {
        for (Aluno aluno : alunos.values()) {
            System.out.println("Matrícula: " + aluno.getMat());
            System.out.println("Nome: " + aluno.getNome());
            System.out.println("Curso: " + aluno.getCurso());
            System.out.println();
        }
    }
}
