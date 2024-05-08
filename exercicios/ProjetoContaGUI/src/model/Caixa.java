package model;

public class Caixa {

    private double saldo;


    public String depositar(double valor){
        if (valor > 0) {
            saldo+=valor;
            return "deposito efetuado com sucesso";
        }
        return "valor invalido para o deposito";
    }

    public String sacar(double valor){
        if (valor<=saldo){
            saldo-=valor;
            return "saque efetuado com sucesso";
        }
        return "sem saldo para saque";
    }

    public double getSaldo(){

        return saldo;
    }



}
