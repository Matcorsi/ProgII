package Practico8.Ejercicio4;

import java.util.ArrayList;

public abstract class Tarea {
    private String nombre;

    public Tarea(String nombre){
        this.nombre = nombre;
    }

    public abstract int getCosto();
    public abstract double getTiempo();

    public abstract ArrayList<String> getTareas();

    public abstract int contarTareasSimples();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
