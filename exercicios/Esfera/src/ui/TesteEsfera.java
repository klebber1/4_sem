package ui;

import model.Esfera;

import java.util.Scanner;

public class TesteEsfera {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do raio: ");
        double raio=Double.parseDouble(sc.nextLine());
        Esfera esfera = new Esfera(raio);
        System.out.println("Volume da Esfera = " + esfera.volumeDaEsfera());
    }
}
