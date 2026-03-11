package br.com.fiap.financeiro.teste;

import br.com.fiap.financeiro.model.Conta;
import br.com.fiap.financeiro.model.Pagamento;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Teste {

    public static void main(String[] args) {
        Conta conta = new Conta("", "Maria Silva", new BigDecimal("1500.00"));

        Pagamento pagamento = new Pagamento(
                "PG-2026-01",
                "Mensalidade FIAP",
                new BigDecimal("650.00"),
                LocalDate.of(2026, 3, 20)
        );

        System.out.println(conta);
        System.out.println(pagamento);

        conta.depositar(new BigDecimal("1000.00"));
        System.out.println(conta.getSaldo());

        pagamento.pagarCom(conta);

        System.out.println("Pagamento realizado.");
        System.out.println(conta);
        System.out.println(pagamento);
    }
}
