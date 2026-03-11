package br.com.fiap.rh.model;

public class Aluno {

    private final String matricula;
    private String nome;
    private int idade;

    public Aluno(String matricula, String nome, int idade) {
        if (matricula == null || matricula.isBlank()) {
            throw new IllegalArgumentException("Matricula é obrigatoria.");
        }
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome é obrigatorio.");
        }
        if (idade < 0) {
            throw new IllegalArgumentException("Idade não pode ser negativa.");
        }

        this.matricula = matricula;
        this.nome = nome;
        this.idade = idade;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void alterarNome(String novoNome) {
        if (novoNome == null || novoNome.isBlank()) {
            throw new IllegalArgumentException("Nome é obrigatorio.");
        }

        this.nome = novoNome;
    }

    public void fazerAniversario() {
        idade++;
    }

    public String estudar(String disciplina) {
        if (disciplina == null || disciplina.isBlank()) {
            throw new IllegalArgumentException("Disciplina é obrigatoria.");
        }

        return nome + " esta estudando " + disciplina + ".";
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "matricula='" + matricula + '\'' +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
