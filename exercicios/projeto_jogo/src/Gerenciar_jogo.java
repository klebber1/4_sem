import java.util.Scanner;

public class Gerenciar_jogo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tabuleiro tabuleiro = new Tabuleiro();
        int[] palpite = new int[2];
        for (int i = 0; i < 2; i++) {
            System.out.println("Digite o palpite");
            palpite[i] = Integer.parseInt(sc.nextLine());
        }
        double resultado = tabuleiro.jogar(palpite);
        if(resultado>0){
            System.out.println("Parabéns! seu premio é");
            System.out.println(resultado);
        }else{
            System.out.println("Não foi dessa vez");
        }

    }
}