package model;

import java.io.Serializable;
import java.util.Objects;

public class Cliente implements Serializable {
    private int codigo;
    private String nome;
    private String cpf;
    private double salario;

    //método construtor
    public Cliente(){

    }
    //métdoco contrutor sobrecarregado (overload)
    public Cliente(int codigo, String nome, String cpf, double salario){
        this.codigo = codigo;
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }
    //mecanismos getters and setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(cpf, cliente.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpf);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", salario=" + salario +
                '}';
    }
}