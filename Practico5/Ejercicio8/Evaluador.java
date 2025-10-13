package Practico5.Ejercicio8;

import java.util.ArrayList;

public class Evaluador {
    private String nombre;
    private ArrayList<String> conocimientos;

    public Evaluador(String nombre){
        this.nombre = nombre;
        this.conocimientos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getConocimientos() {
        return conocimientos;
    }

    public void addConocimiento(String conocimiento) {
        this.conocimientos.add(conocimiento);
    }

    
}
