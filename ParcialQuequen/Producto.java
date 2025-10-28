package ParcialQuequen;

import java.util.ArrayList;

public abstract class Producto {
    private String nombre;
    
    public Producto(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract double getPeso();
    public abstract double getVolumen();
    public abstract int getCantidad();
    public abstract ArrayList<String> getCaracteristicas();
    public abstract ArrayList<Coleccionable> buscar(Filtro filtro);
    public abstract double getCosto();

    
}
