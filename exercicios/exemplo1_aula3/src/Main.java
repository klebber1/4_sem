import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salario;

        boolean produtividade;

        double salarioReajustado;

        System.out.println("Digite o salario:");

        salario = Double.parseDouble(sc.nextLine());

        System.out.println("Digite 1 para produtividade, 0 para contrario: ");

        int resposta = Integer.parseInt(sc.nextLine());
        /*produtividade = resposta==1;*/
        if (resposta ==1){
            produtividade = true;
        }else {
            produtividade = false;
        }

        salarioReajustado = produtividade ? salario * 1.1 : salario * 1.5;

        System.out.println("Salario novo calculado: "+ salarioReajustado);

    }
}