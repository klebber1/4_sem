package model;

public class Poupanca extends Conta{
    private int diaAniversario;

    public Poupanca(int numero, String nomeCliente, int diaAniversario) {
        super(numero, nomeCliente);
        this.diaAniversario = diaAniversario;
    }

    public int getDiaAniversario() {
        return diaAniversario;
    }

    public void setDiaAniversario(int diaAniversario) {
        this.diaAniversario = diaAniversario;
    }

    @Override
    public String toString() {
        final StringBuilder sb= new StringBuilder();
        sb.append(super.toString());
        sb.append("dia de aniversario=").append(diaAniversario).append("\n");
        return sb.toString();
    }

    @Override
    void cobrarTaxa() {
        System.out.println("Atualmente nao cobramos taxa de poupanca");
    }

}
