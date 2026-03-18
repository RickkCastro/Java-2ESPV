package br.com.fiap.produto.teste;

import br.com.fiap.produto.model.Produto;

public class Teste {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.nome = "Fulano";
        produto.preco = 12.5;
        produto.quantidade = 100;

        produto.exibirInformacoes();
    }
}
