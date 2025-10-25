package Practico8.Ejercicio5;

import java.util.ArrayList;

public abstract class Evaluable {
    private String nombre;

    public Evaluable(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract double getPuntaje();
    public abstract double getTiempo();
    public abstract ArrayList<String> getConceptos();
}
