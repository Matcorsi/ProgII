package Recu2;

import java.util.ArrayList;

public abstract class Trabajo{
    private String nombre;
    private ArrayList<String> materiales;

    public Trabajo(String nombre){
        this.nombre = nombre;
        this.materiales = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void addMaterial(String material) {
        if(!materiales.contains(material)){
            materiales.add(material);
        }
    }

    public ArrayList<String> getMateriales(){
        return new ArrayList<>(materiales);
    }

    public abstract int cantidadEmpleados();
    public abstract int cantidadDias();
    public abstract ArrayList<Trabajo> buscar(Filtro filtro);
    public abstract double getCosto(Costo costo);

    
}
