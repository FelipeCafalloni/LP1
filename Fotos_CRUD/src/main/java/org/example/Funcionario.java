package org.example;

public class Funcionario {
    private String nome;
    private String cargo;
    private double salario;
    private int id;

    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }


    public Funcionario(int id, String nome, String cargo, double salario) {
        this.id = id;
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }


    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public double getSalario() {
        return salario;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}

