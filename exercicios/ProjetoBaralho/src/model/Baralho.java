package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baralho {
    private List<Carta> cartas = new ArrayList<>();

    //metodo construtor
    //vamos montar um baralho inteirp
    public Baralho(){
        montar();
    }
    public void montar(){
        for(Naipe naipe : Naipe.values()){//cada naipe
            for(Valor valor : Valor.values()){//cada valor
                Carta carta = new Carta(naipe,valor);
                cartas.add(carta); //adicionar uma a uma na lista
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder meuBaralho = new StringBuilder();
        for(Carta carta : cartas){
            meuBaralho.append(carta.toString());
        }
        return meuBaralho.toString();
    }

    public void embaralhar(){
        Collections.shuffle(cartas); //
    }
}