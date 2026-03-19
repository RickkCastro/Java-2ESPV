package br.com.fiap.sobrecarga;

public class Soma {

    public int somar(int num1, int num2) {
        return num1 + num2;
    }

    public double somar(double num1, double num2) {
        return num1 + num2;
    }

    public String somar(String num1, String num2) {
        return num1 + num2;
    }
}
