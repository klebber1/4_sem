package model;

public class ContaCorrente extends Conta{

    private boolean temLimite;
    private double limite;

    public ContaCorrente(int numero, String nomeCliente, boolean temLimite, double limite) {
        super(numero, nomeCliente);
        this.temLimite = temLimite;
        this.limite = limite;
    }

    public boolean isTemLimite() {
        return temLimite;
    }

    public void setTemLimite(boolean temLimite) {
        this.temLimite = temLimite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    @Override
    public String toString() {
        final StringBuilder sb= new StringBuilder();
        sb.append(super.toString());
        sb.append("dValor Limite= ").append(limite).append("\n");
        return sb.toString();
    }

    @Override
    void cobrarTaxa() {
        System.out.println("Avaliando cobrar taxa ");
    }

    @Override
    public void sacar(double valor) {
        if (valor<= (getSaldo()+limite)){
            cobrarTaxa();
            setSaldo(getSaldo()-valor);
        }
    }
}
