import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ContaTeste {
    /*
     public Conta cc;
    */
    Conta cc = new Conta();



    public static void main(String[] args) {

        ContaTeste contaTeste = new ContaTeste();
       // Scanner scanner = new Scanner(System.in);

        int op =0;
        do {
            System.out.println("==============Banco do Maromo:=================");
            System.out.println("1- Depositar");
            System.out.println("2- Sacar");
            System.out.println("3- Consultar");
            System.out.println("4- Cadastrar");
            System.out.println("5- Sair");
            System.out.println("Digite a opcao desejada: ");
            Scanner scanner = new Scanner(System.in);
            op = scanner.nextInt();


            while (op < 0 || op > 5) {
                System.out.println("Opcao nao existe");
                System.out.println("Digite uma das opcoes do menu acima");
                op = scanner.nextInt();
            }


            switch (op) {
                case 1:

                    contaTeste.exeDepositar();
                    break;

                case 2:
                    contaTeste.exeSacar();
                    break;

                case 3:
                    contaTeste.exeConsultar();
                    break;

                case 4:
                    contaTeste.exeCadastrar();
                    break;

                case 5:
                    System.exit(0);
                    break;

            }

        } while (op != 5);

    }
    public void exeCadastrar(){
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite o nome");
        cc.nomeCliente = scanner.nextLine();
        System.out.println("Digite a conta");
        cc.conta = scanner.nextLine();
        System.out.println("Digite a agencia");
        cc.agencia = scanner.nextLine();



    }
    public void exeConsultar(){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        cc.imprimir();
        System.out.println();
        System.out.println("Pressione enter para continuar: ");
        try {
            reader.readLine(); // Aguarda até que o usuário pressione Enter
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void exeSacar(){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double x =0;
        int y = 2;

        System.out.println("Voce escolheu a opcao sacar");
        System.out.println("Para sacar digite um valor");
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextDouble();
        y = cc.sacar(x);

        if (y==1){
            System.out.println("Valor sacado");
            System.out.println("Digite enter para continuar");
            try {
                reader.readLine(); // Aguarda até que o usuário pressione Enter
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (y==0){
            System.out.println("Saldo insuficiente, voce eh pobre");
            System.out.println("Digite enter para continuar");
            try {
                reader.readLine(); // Aguarda até que o usuário pressione Enter
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
    public void exeDepositar() {
        double x = 0;

        System.out.println("Voce escolheu a opcao depositar");
        System.out.println("Para depositar digite um valor");
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextDouble();
        if (x<=0){
            System.out.println("Nao eh possivel depositar valores negativos ou 0");
        }else
            cc.depositar(x);
            System.out.println("Valor depositado");
        }


}