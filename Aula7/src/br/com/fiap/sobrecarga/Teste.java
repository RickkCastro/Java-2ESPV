package br.com.fiap.sobrecarga;

public class Teste {
    public static void main(String[] args) {
        Soma s = new Soma();

        System.out.println(s.somar(1, 2));
        System.out.println(s.somar(1.5, 2.2));
        System.out.println(s.somar("1", "2"));
    }
}
