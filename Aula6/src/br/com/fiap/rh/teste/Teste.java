package br.com.fiap.rh.teste;

import br.com.fiap.rh.model.Aluno;

public class Teste {
    public  static void main(String[] args) {
        Aluno aluno = new Aluno("RM12345", "Maria", 20);

        System.out.println(aluno);
        System.out.println(aluno.estudar("DDD"));
    }
}
