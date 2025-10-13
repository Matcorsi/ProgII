package Practico5.Ejercicio8;

import java.util.ArrayList;

public class Congreso {
    private String nombre;
    private ArrayList<Evaluador> evaluadores;
    private ArrayList<Trabajo> trabajos;
    private ArrayList<String> temas_generales;
    private ArrayList<String> temas_expertos;

    public Congreso(String nombre){
        this.nombre = nombre;
        this.evaluadores = new ArrayList<>();
        this.trabajos = new ArrayList<>();
        this.temas_generales = new ArrayList<>();
        this.temas_expertos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Evaluador> getEvaluadores() {
        return evaluadores;
    }

    public void addEvaluador(Evaluador evaluador) {
        this.evaluadores.add(evaluador);
    }

    public ArrayList<Trabajo> getTrabajos() {
        return trabajos;
    }

    public void addTrabajo(Trabajo trabajo) {
        this.trabajos.add(trabajo);
    }

    public ArrayList<String> getTemasGenerales() {
        return temas_generales;
    }

    public void addTemaGenereal(String tema) {
        this.temas_generales.add(tema);
    }

    public ArrayList<String> getTemasExpertos() {
        return temas_expertos;
    }

    public void addTemaExpertos(String tema) {
        this.temas_expertos.add(tema);
    }

    
}
