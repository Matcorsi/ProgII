package Practico7.Ejercicio3;

import java.util.ArrayList;

public class Vivero {
    private String nombre;
    private ArrayList<Planta> plantas;

    public Vivero(String nombre){
        this.nombre = nombre;
        this.plantas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean contienePlanta(Planta planta) {
        return plantas.contains(planta);
    }

    public void addPlanta(Planta planta) {
        if(!plantas.contains(planta)){
            plantas.add(planta);
        }
    }

    public ArrayList<Planta> obtenerPlantas(Filtro filtro){
        ArrayList<Planta> plantasFiltradas = new ArrayList<>();
        for(Planta planta : plantas){
            if(filtro.cumple(planta)){
                plantasFiltradas.add(planta);
            }
        }
        return plantasFiltradas;
    }
}
