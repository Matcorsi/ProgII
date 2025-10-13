package Practico5.Ejercicio8;

import java.util.ArrayList;

public class Trabajo {
    private String nombre;
    private ArrayList<String> palabras_clave;

    public Trabajo(String nombre){
        this.nombre = nombre;
        this.palabras_clave = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getPalabras_clave() {
        return palabras_clave;
    }

    public void addPalabras_clave(String palabra_clave) {
        this.palabras_clave.add(palabra_clave);
    }

    
}
