package br.com.fiap.financeiro.model;

import java.math.BigDecimal;

public class Conta {

    private final String numero;
    private final String titular;
    private BigDecimal saldo;

    public Conta(String numero, String titular, BigDecimal saldoInicial) {
        if (numero == null || numero.isBlank()) {
            throw new IllegalArgumentException("Numero da conta e obrigatorio.");
        }
        if (titular == null || titular.isBlank()) {
            throw new IllegalArgumentException("Titular e obrigatorio.");
        }
        if (saldoInicial == null) {
            throw new IllegalArgumentException("Saldo inicial e obrigatorio.");
        }
        if (saldoInicial.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("Saldo inicial nao pode ser negativo.");
        }

        this.numero = numero;
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public String getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void depositar(BigDecimal valor) {
        validarValor(valor);
        saldo = saldo.add(valor);
    }

    public void debitar(BigDecimal valor) {
        validarValor(valor);

        if (saldo.compareTo(valor) < 0) {
            throw new IllegalArgumentException("Saldo insuficiente para debito.");
        }

        saldo = saldo.subtract(valor);
    }

    private void validarValor(BigDecimal valor) {
        if (valor == null) {
            throw new IllegalArgumentException("Valor e obrigatorio.");
        }
        if (valor.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Valor deve ser maior que zero.");
        }
    }

    @Override
    public String toString() {
        return "Conta{" +
                "numero='" + numero + '\'' +
                ", titular='" + titular + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
