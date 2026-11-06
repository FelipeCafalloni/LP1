package org.example;

public class Venda {
    private String vendedor;
    private String cliente;
    private double valor;

    public Venda(String vendedor, String cliente, double valor) {
        this.vendedor = vendedor;
        this.cliente = cliente;
        this.valor = valor;
    }

    public String getVendedor() {
        return vendedor;
    }

    public String getCliente() {
        return cliente;
    }

    public double getValor() {
        return valor;
    }
}
