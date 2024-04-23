package ui;

import model.Baralho;

public class GerenciarJogo {
    public static void main(String[] args) {
        Baralho baralho = new Baralho();
        System.out.println(baralho);
        baralho.embaralhar();
        System.out.println();
        System.out.println(baralho);
    }
}