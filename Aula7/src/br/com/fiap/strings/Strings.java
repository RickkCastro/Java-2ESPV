package br.com.fiap.strings;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite uma frase: ");
        String frase = input.nextLine();

        System.out.println(frase.toUpperCase());
        System.out.println(frase.length());
        System.out.println(frase.contains("Java"));
        System.out.println(new StringBuilder(frase).reverse().toString());

    }
}
