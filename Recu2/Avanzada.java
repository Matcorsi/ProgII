package Recu2;

import java.util.ArrayList;

public class Avanzada extends Complejo{
    
    public Avanzada(String nombre){
        super(nombre);
    }

    @Override
    public int cantidadDias(){
        int mayorTiempo = 0;
        for(Trabajo tt : this.getTrabajos()){
            int tiempoMomentaneo = tt.cantidadDias();
            if(tiempoMomentaneo > mayorTiempo){
                mayorTiempo = tiempoMomentaneo;
            }
        }
        return mayorTiempo;
    }

    @Override
    public ArrayList<String> getMateriales(){
        ArrayList<String> retorno = new ArrayList<>();
        for(Trabajo tt : this.getTrabajos()){
            ArrayList<String> materiales = tt.getMateriales();
            retorno.addAll(materiales);
        }
        return retorno;
    }
}
