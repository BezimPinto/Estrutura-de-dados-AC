
    public class Teste {
    public static void main(String[] args) {
        AlunoCRUD alunoCRUD = new AlunoCRUD();

        alunoCRUD.addAluno("56894", "Bezim", "Ciencia de dados");
        alunoCRUD.addAluno("03285", "Fulano", "Ciências da Computação");

        alunoCRUD.listarAlunos();

        alunoCRUD.attCurso("56894", "ADS");
        alunoCRUD.removerAluno("03285");

        alunoCRUD.AlunoMat("56894");
        alunoCRUD.AlunoMat("03285");
    }
}