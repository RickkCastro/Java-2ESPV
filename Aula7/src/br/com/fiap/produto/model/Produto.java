package br.com.fiap.produto.model;

public class Produto {
    public String nome;
    public double preco;
    public int quantidade;


    public double calcularValorTotal(){
        return preco*quantidade;
    }
    public void exibirInformacoes(){
        System.out.println("Nome do produto: " + nome +
                "\nPreço: " + preco +
                "\nQuantidade: " + quantidade +
                "\nValor total: " + calcularValorTotal());
    }
}
