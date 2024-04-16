package model;

public class Esfera {
    private double raio;
    public Esfera(double raio){
        this.raio = raio;
    }
    public double volumeDaEsfera(){
        return 4.0/3 * Math.PI * Math.pow(raio,3.0);
    }
}
