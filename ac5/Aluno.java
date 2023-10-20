

class Aluno {
    private String mat;
    private String nome;
    private String curso;

    public Aluno(String mat, String nome, String curso) {
        this.mat = mat;
        this.nome = nome;
        this.curso = curso;
    }

    public String getMat() {
        return mat;
    }

    public String getNome() {
        return nome;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }
}




