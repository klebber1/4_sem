public class ComputadorTeste {
    public static void main(String[] args) {
        Computador pc = new Computador();
        pc.Marca= "HP";
        pc.Preco= 500;
        pc.Modelo= "gti";
        pc.Cor ="preto";
        pc.NumeroSerie=12345;
        pc.imprimir();
        System.out.println();
        pc.calcularValor();
        pc.imprimir();

        System.out.println();

        Computador pc2 = new Computador();
        pc2.Marca= "IBM";
        pc2.Preco= 1000;
        pc2.Modelo= "super";
        pc2.Cor ="branco";
        pc2.NumeroSerie=54321;
        pc2.imprimir();
        System.out.println();
        pc2.calcularValor();
        pc2.imprimir();
        System.out.println();
        int q= pc2.alterarValor(100);
        if (q>0){
            System.out.println("Valor alterado!");
        }
        if (q==0){
            System.out.println("Valor nao alterado!");
        }
        pc2.imprimir();

    }
}
