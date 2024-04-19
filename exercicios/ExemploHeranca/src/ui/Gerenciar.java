package ui;

import model.Conta;
import model.ContaCorrente;
import model.Poupanca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Gerenciar {

    Scanner sc = new Scanner();

    List <Conta> listaconta = new ArrayList<>();

    public static void main(String[] args) {

        Gerenciar gerenciar = new Gerenciar();

        int opcao =0;

        do {
            System.out.println("Menu Principal");
            System.out.println("1-Cadastrar Conta");
            System.out.println("2-Consultar Conta");
            System.out.println("3-Excluir Conta");
            System.out.println("4-Listar Todas as Contas");
            System.out.println("5-Exibir Saldo");
            System.out.println("6-Total Acumulado das Contas");
            System.out.println("9-Finalizar");
            opcao=Integer.parseInt(gerenciar.sc.nextLine());
            switch (opcao){
                case 1:
                    gerenciar.exeCadastrar();
                    break;
                case 2:
                    gerenciar.exeConsultar();
                    break;
                case 3:
                    gerenciar.exeExcluir();
                    break;
                case 4:
                    gerenciar.exeListar();
                    break;
                case 5:
                    gerenciar.exeExibirSaldo();
                    break;
                case 6:
                    gerenciar.exeTotalizar();
                    break;
                case 9:
                    System.out.println("Fim do Programa");
                    break;
                default:
                    System.out.println("");
            }


        }while (opcao !=9);


    }

    private void exeTotalizar() {
    }

    private void exeExibirSaldo() {
    }

    private void exeListar() {
    }

    private void exeExcluir() {
    }

    private void exeConsultar() {
        int numero;
        System.out.printf("Digite o numero da conta a consultar");
        numero = Integer.parseInt(sc.nextLine());
        for (Conta conta : listaconta) {
            if (conta.getNumero()==numero);
            System.out.println(conta);
            return;
        }


    }

    private void exeCadastrar() {
        int tipo;
        double limite;
        String nome;
        int numeroConta = 0;
        int diaAniversario;
        boolean temLimite;
        System.out.println("Digite 1 para Corrente, 2 para Poupanca");
        tipo = Integer.parseInt(sc.nextLine());
        if (tipo < 1 || tipo > 2){
            System.out.println("Tipo invalido. Verifique");
            return;
        }
        System.out.printf("Digite o nome do Cliente");
        nome=sc.nextLine();
        if (tipo == 1){
            System.out.println("Digite o valor do limite");
            limite = Double.parseDouble(sc.nextLine());
            if (limite>0){
                temLimite = true;
            }else {
                temLimite = false;
            }
            ContaCorrente conta = new ContaCorrente(numeroConta, nome, temLimite, limite);
            System.out.println("Conta Corrente Cadastrada");
            listaconta.add(conta);
        }else {
            System.out.printf("Digite o dia de anuversario da conta");
            diaAniversario = Integer.parseInt(sc.nextLine());
            Poupanca poupanca = new Poupanca(numeroConta, nome, diaAniversario);
            System.out.println("Poupanca cadastrada com sucesso");
            listaconta.add(poupanca);
        }

    }
}
