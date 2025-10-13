package Practico5.Ejercicio8;

import java.util.ArrayList;

public class Trabajo {
    private String nombre;
    private ArrayList<String> palabras_clave;
    private Evaluador evaluador;

    public Trabajo(String nombre){
        this.nombre = nombre;
        this.palabras_clave = new ArrayList<>();
        this.evaluador = null;
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

    public Evaluador getEvaluador() {
        return evaluador;
    }

    public void designarEvaluador(Evaluador evaluador) {
        this.evaluador = evaluador;
    }

    public boolean estaApto(Evaluador evaluador){
        if (evaluador.getConocimientos().containsAll(palabras_clave)){
            designarEvaluador(evaluador);
            return true;
        } else {
            return false;
        }
    }
    
}
