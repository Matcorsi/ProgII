package Practico5.Ejercicio6;

import java.util.ArrayList;

public class Pais {
    private String nombre;
    private ArrayList<Provincia> provincias;
    private int cant_habitantes;

    public Pais(String nombre){
        this.nombre = nombre;
        this.provincias = new ArrayList<>();
        this.cant_habitantes = cantHabitantes();
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(String nombre){
        return this.nombre;
    }

    public int cantHabitantes(){
        int cantidad = 0;
        if(!this.provincias.isEmpty()){
            for(int i = 0; i < this.provincias.size(); i++){
                cantidad += this.provincias.get(i).cantHabitantes();
            }
        }
        return cantidad;
    }

    public int getHabitantes(){
        return this.cant_habitantes;
    }

    public void addProvincia(Provincia prov){
        this.provincias.add(prov);
    }

    public void ciudadesDeficit(){
        ArrayList<Ciudad> ciudadesGrandes = new ArrayList<>();
        if (!this.provincias.isEmpty()) {
            for(int i = 0; i < this.provincias.size(); i++){
                ciudadesGrandes = this.provincias.get(i).ciudadGrande();
            }
            for(int i = 0; i < ciudadesGrandes.size(); i++){
                ciudadesGrandes.get(i).deficit();
            }
        }
    }
}
