package br.com.fiap.aluno.teste;

import br.com.fiap.aluno.model.Aluno;

public class Teste {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setNome("Rickk");
        aluno.setMatricula(1);
        aluno.setNota(10);

        System.out.println(aluno.getNome() + " " + aluno.getMatricula() + " " + aluno.getNota());

        Aluno aluno2 = new Aluno("Dudu", 2, 5.2);

        System.out.println(aluno2.getNome() + " " + aluno2.getMatricula() + " " + aluno2.getNota());
    }
}
