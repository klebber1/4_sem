import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciarFuncionario {

    private List<Funcionario>ListaFuncionarios = new ArrayList<>();0


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GerenciarFuncionario gerenciar = new GerenciarFuncionario();

        int op=0;
        do {

        }while (op==9);




    }

    public void execCadastrar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Dados o nome do Funcionario");
        String nome = sc.nextLine();
        System.out.println("Digite o departamento do funcionario");
        String departamento = sc.nextLine();
        System.out.println("Digite o rg do funcionario");
        String rg = sc.nextLine();
        System.out.println("Digite o salario do funcionario");
        double salario = Double.parseDouble(sc.nextLine());
        Funcionario func = new Funcionario(nome, departamento, rg, salario);
        System.out.println("Digite o departamento do funcionario");
        ListaFuncionarios.add(func);
        System.out.println("Cadas");

    }
    public void execBonificar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor da bonificacao: ");
        String rgProc = sc.nextLine();
        for (Funcionario f : ListaFuncionarios)
    }

    }
    public void execConsultar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o RG do Funcionario a ser exibido: ");
        String rgProc = sc.nextLine();
        for (Funcionario f : ListaFuncionarios){

        }
    }
    public void execConsultarTodos(){



    }

}
