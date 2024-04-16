import java.util.Objects;

public class Computador {
    public String Marca;
    public String Cor;
    public String Modelo;
    public long NumeroSerie;
    public double Preco;

    @Override
    public String toString() {
        return "Computador{" +
                "Marca='" + Marca + '\'' +
                ", Cor='" + Cor + '\'' +
                ", Modelo='" + Modelo + '\'' +
                ", NumeroSerie=" + NumeroSerie +
                ", Preco=" + Preco +
                '}';
    }

    /*  public void imprimir(){

        System.out.println("A marca é: "+Marca);
        System.out.println("A cor é: "+Cor);
        System.out.println("O modelo é: "+Modelo);
        System.out.println("O numero de serie é: "+NumeroSerie);
        System.out.println("o valor: "+Preco);

    }*/

    public void calcularValor(){

        if (Objects.equals(Marca, "HP")){
            Preco += Preco*0.3;
        }
        if (Objects.equals(Marca, "IBM")){
            Preco += Preco*0.5;
        }
    }

    public int alterarValor(double x){
        if (x>0){
            Preco=x;
            return 1;
        }
        return 0;
    }
}
