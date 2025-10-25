package Practico8.Ejercicio5;

import java.util.ArrayList;

public class Pregunta extends Evaluable {
    private double puntaje;
    private double tiempo;
    private ArrayList<String> conceptos;

    public Pregunta(String nombre, double puntaje, double tiempo, ArrayList<String> conceptos) {
        super(nombre);
        this.puntaje = puntaje;
        this.tiempo = tiempo;
        this.conceptos = new ArrayList<>(conceptos);
    }

    @Override
    public double getPuntaje() {
        return puntaje;
    }

    @Override
    public double getTiempo() {
        return tiempo;
    }

    @Override
    public ArrayList<String> getConceptos() {
        return new ArrayList<>(conceptos);
    }
}
