package Practico3.Ejercicio1;

import java.util.ArrayList;

public class Encuesta {
    private String nombre;
    private ArrayList<Pregunta> preguntas;

    public Encuesta(String nombre){
        this.nombre = nombre;
        this.preguntas = new ArrayList<>();
    }

    public void setNombreEncuesta(String nombre){
        this.nombre = nombre;
    }

    public String getNombreEncuesta(){
        return this.nombre;
    }

    public void AgregarPregunta(Pregunta pregunta){
        this.preguntas.add(pregunta);
    }

    public ArrayList<Pregunta> getPreguntas() {
        return preguntas;
    }


}
