package org.example;

public class Venda {
    private int id;
    private String vendedor;
    private String cliente;
    private double valor;


    public Venda(int id, String vendedor, String cliente, double valor) {
        this.id = id;
        this.vendedor = vendedor;
        this.cliente = cliente;
        this.valor = valor;
    }

    public Venda(String vendedor, String cliente, double valor) {
        this.vendedor = vendedor;
        this.cliente = cliente;
        this.valor = valor;
    }

    public int getId() {return id;}

    public String getVendedor() {
        return vendedor;
    }

    public String getCliente() {
        return cliente;
    }

    public double getValor() {return valor;}

    public void setId(int id) {
        this.id = id;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
