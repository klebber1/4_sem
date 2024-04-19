package model;

public abstract class Conta {
    private int numero;
    private String nomeCliente;
    private double saldo;

    public Conta(int numero, String nomeCliente) {
        this.numero = numero;
        this.nomeCliente = nomeCliente;
        this.saldo = 0.0;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor){
        saldo+=valor;
    }
    public void sacar(double valor){
        if (valor<=saldo){
            saldo-=valor;
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Conta do Cliente: \n");
        sb.append("numero=").append(numero).append("\n");
        sb.append(", nomeCliente='").append(nomeCliente).append("\n");
        sb.append(", saldo=").append(saldo).append("\n");
        return sb.toString();
    }
    abstract void cobrarTaxa();
}
