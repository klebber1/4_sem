
public class Conta {
    public String conta;
    public String agencia;
    public double saldo = 0;
    public String nomeCliente;

    public int sacar(double x) {

        if (x <= saldo) {
            saldo -= x;
            return 1;
        }
            return 0;
    }
    public void depositar(double x) {

        saldo += x;
    }
    public void imprimir() {
        System.out.println("Nome do cliente: " +nomeCliente);
        System.out.println("Conta corrente: "+conta);
        System.out.println("Agencia: "+agencia);
        System.out.println("Osaldo oatual eh: "+saldo);

    }
}

