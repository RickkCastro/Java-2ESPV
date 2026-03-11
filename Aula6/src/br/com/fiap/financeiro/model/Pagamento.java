package br.com.fiap.financeiro.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Pagamento {

    private final String codigo;
    private final String descricao;
    private final BigDecimal valor;
    private final LocalDate dataVencimento;
    private boolean pago;

    public Pagamento(String codigo, String descricao, BigDecimal valor, LocalDate dataVencimento) {
        if (codigo == null || codigo.isBlank()) {
            throw new IllegalArgumentException("Codigo do pagamento e obrigatorio.");
        }
        if (descricao == null || descricao.isBlank()) {
            throw new IllegalArgumentException("Descricao e obrigatoria.");
        }
        if (valor == null || valor.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Valor do pagamento deve ser maior que zero.");
        }
        if (dataVencimento == null) {
            throw new IllegalArgumentException("Data de vencimento e obrigatoria.");
        }

        this.codigo = codigo;
        this.descricao = descricao;
        this.valor = valor;
        this.dataVencimento = dataVencimento;
        this.pago = false;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    public boolean isPago() {
        return pago;
    }

    public void pagarCom(Conta conta) {
        if (conta == null) {
            throw new IllegalArgumentException("Conta para pagamento e obrigatoria.");
        }
        if (pago) {
            throw new IllegalStateException("Pagamento ja foi realizado.");
        }

        conta.debitar(valor);
        pago = true;
    }

    @Override
    public String toString() {
        return "Pagamento{" +
                "codigo='" + codigo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", valor=" + valor +
                ", dataVencimento=" + dataVencimento +
                ", pago=" + pago +
                '}';
    }
}
