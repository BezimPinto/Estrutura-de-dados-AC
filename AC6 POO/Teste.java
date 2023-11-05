import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        AlunoCRUD alunoDAO = new AlunoCRUD();
        carregarDadosIniciais(alunoDAO);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Listar alunos");
            System.out.println("2 - Adicionar aluno");
            System.out.println("3 - Remover aluno");
            System.out.println("4 - Atualizar curso de aluno");
            System.out.println("5 - Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    alunoDAO.listarAlunos();
                    break;
                case 2:
                    System.out.print("Digite a matrícula do aluno: ");
                    String mat = scanner.nextLine();
                    System.out.print("Digite o nome do aluno: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite o curso do aluno: ");
                    String curso = scanner.nextLine();
                    alunoDAO.addAluno(mat, nome, curso);
                    System.out.println("Aluno adicionado com sucesso.");
                    break;
                case 3:
                    System.out.print("Digite a matrícula do aluno a ser removido: ");
                    mat = scanner.nextLine();
                    alunoDAO.removerAluno(mat);
                    System.out.println("Aluno removido com sucesso.");
                    break;
                case 4:
                    System.out.print("Digite a matrícula do aluno para atualizar o curso: ");
                    mat = scanner.nextLine();
                    System.out.print("Digite o novo curso: ");
                    curso = scanner.nextLine();
                    alunoDAO.attCurso(mat, curso);
                    System.out.println("Curso atualizado com sucesso.");
                    break;
                case 5:
                    salvarDados(alunoDAO);
                    System.out.println("Programa encerrado.");
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private static void carregarDadosIniciais(AlunoCRUD alunoDAO) {

        alunoDAO.addAluno("12345", "Nome1", "Curso1");
        alunoDAO.addAluno("67890", "Nome2", "Curso2");
        
    }

    private static void salvarDados(AlunoCRUD alunoDAO) {
        for (Aluno aluno : alunoDAO.getAlunos()) {
            
    }
}
}