package ui;

import model.Cliente;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciarCliente {
    private List<Cliente> clienteList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //Objeto para gerenciar os clientes
        GerenciarCliente gerenciarCliente = new GerenciarCliente();
        int opcao = 0;
        do{
            opcao = gerenciarCliente.execMenu();
            switch (opcao){
                case 1:
                    gerenciarCliente.execCadastrar();
                    break;
                case 2:
                    gerenciarCliente.execConsultar();
                    break;
                case 3:
                    gerenciarCliente.execAlterar();
                    break;
                case 4:
                    gerenciarCliente.execExcluir();
                    break;
                case 5:
                    gerenciarCliente.execListar();
                    break;
                case 9:
                    System.out.println("Fim do Programa");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }while(opcao!=9);
    }

    private int execMenu() {
        System.out.println("Menu Principal de Clientes");
        System.out.println("1. Cadastrar");
        System.out.println("2. Consultar");
        System.out.println("3. Alterar");
        System.out.println("4. Excluir");
        System.out.println("5. Listar todos");
        System.out.println("9. Sair");
        System.out.println("Digite sua opção: ");
        return Integer.parseInt(scanner.nextLine());
    }

    public void execCadastrar(){
        System.out.println("Por favor, informe dados do cliente");
        System.out.println("Digite o código do cliente: ");
        int codigo = Integer.parseInt(scanner.nextLine());
        System.out.println("Digite o nome do cliente: ");
        String nome = scanner.nextLine();
        System.out.println("Digite o cpf do cliente: ");
        String cpf = scanner.nextLine();
        System.out.println("Digite o salario do cliente: ");
        double salario = Double.parseDouble(scanner.nextLine());
        Cliente cliente = new Cliente(codigo,nome,cpf,salario);
        clienteList.add(cliente); //adicionamos o cliente na lista
        System.out.println("Cliente cadastrado com sucesso");
    }
    public void execConsultar(){
        Cliente clienteProcurado = null;
        String cpf; //usar o cpf dado pelo usuário para a busca
        System.out.println("Digite o cpf do cliente a Consultar: ");
        cpf = scanner.nextLine();
        clienteProcurado = procurarCliente(cpf);
        if(clienteProcurado!=null){
            System.out.println(clienteProcurado);
        }else{
            System.out.println("Cliente com este cpf não encontrado");
        }
    }

    private Cliente procurarCliente(String cpf) {
        //varrer a lista a procura de um cpf igual
        for(Cliente cli : clienteList){
            if(cpf.equals(cli.getCpf())){
                return cli;
            }
        }
        return null;
    }

    public void execAlterar(){
        Cliente clienteProcurado = null;
        String cpf; //usar o cpf dado pelo usuário para a busca
        System.out.println("Digite o cpf do cliente a Alterar: ");
        cpf = scanner.nextLine();
        clienteProcurado = procurarCliente(cpf);
        if(clienteProcurado!=null){
            System.out.println("Digite o nome atual: ");
            clienteProcurado.setNome(scanner.nextLine());
            System.out.println("Digite o novo salário: ");
            clienteProcurado.setSalario(Double.parseDouble(scanner.nextLine()));
            System.out.println("Dados do cliente alterado com sucesso");
        }else{
            System.out.println("Cliente com este cpf não encontrado");
        }
    }
    public void execExcluir(){
        Cliente clienteProcurado = null;
        String cpf; //usar o cpf dado pelo usuário para a busca
        System.out.println("Digite o cpf do cliente a Excluir: ");
        cpf = scanner.nextLine();
        clienteProcurado = procurarCliente(cpf);
        if(clienteProcurado!=null){
            clienteList.remove(clienteProcurado);
            System.out.println("Cliente inativado para sempre");
        }else{
            System.out.println("Cliente com este cpf não encontrado");
        }
    }
    public void execListar(){
        for(Cliente cli : clienteList){
            System.out.println(cli);
            System.out.println();
        }
    }

}