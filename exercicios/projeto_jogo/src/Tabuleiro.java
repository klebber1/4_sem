public class Tabuleiro {
    private int[][] tabu = new int[10][10];
    private int[] palpites = new int[2];

    public Tabuleiro(){
        //Logica de montar o tabuleiro com valores
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                tabu[i][j] = (int)(Math.random() * 100);
            }
        }
    }

    public double jogar(int[] palpites){
        this.palpites = palpites;
        int acertos = buscar();
        mostrarTabuleiro();
        if(acertos >=3){
            return 1000.0 * acertos;
        }else{
            return 0.0;
        }

    }

    private void mostrarTabuleiro() {
        for(int[] vetor : tabu){
            for(int valor : vetor){
                if(palpites[0] == valor || palpites[1] == valor){
                    System.out.printf("[ %2d*]", valor);
                }else{
                    System.out.printf("[ %2d ]", valor);
                }

            }
            System.out.println();
        }
    }

    private int buscar() {
        int total = 0;
        for(int palpite : palpites){
            for(int[] vetor : tabu){
                for(int valor : vetor){
                    if(valor == palpite)total++;
                }
            }
        }
        return total;
    }

}