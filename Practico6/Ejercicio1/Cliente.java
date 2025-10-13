package Practico6.Ejercicio1;

import java.util.ArrayList;

public class Cliente {
    
    private String nombre;
    private String dni;
    private ArrayList<Item> alquileres;

    public Cliente(String nombre, String dni){
        this.nombre = nombre;
        this.dni = dni;
        this.alquileres = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public ArrayList<Item> getAlquileres() {
        return alquileres;
    }

    public void addAlquiler(Item alquiler) {
        this.alquileres.add(alquiler);
    }

    
}
