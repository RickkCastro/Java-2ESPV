package br.com.fiap.operadores;

import java.util.Scanner;

public class Operadores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int num1 = input.nextInt();

        System.out.println("Digite outro numero: ");
        int num2 = input.nextInt();

        int soma = num1 + num2;
        int subtracao = num1 - num2;
        int multiplicacao = num1 * num2;
        int divisao = num1 / num2;

        int maiorValor = num1 > num2 ? num1 : num2;

        System.out.println("Valores\nSoma: " + soma +
                "\nSubtração: " + subtracao +
                "\nMultiplicação: " + multiplicacao +
                "\nDivisão: " + divisao +
                "\nMaior Valor: " + maiorValor);
    }
}
