package Practico4.Ejercicio4;

import java.util.ArrayList;

public class Administracion {
    ArrayList<Integrante> delegacion;

    public Administracion(){
        this.delegacion = new ArrayList<>();
    }

    public void addIntegrante(Integrante integrante){
        this.delegacion.add(integrante);
    }

    public ArrayList<Integrante> disponibilidad(){
        ArrayList<Integrante> disponibles = new ArrayList<>();
        for(Integrante integrante : delegacion){
            if(integrante.estaDisponible()){
                disponibles.add(integrante);
            }
        }
        return disponibles;
    }
}
