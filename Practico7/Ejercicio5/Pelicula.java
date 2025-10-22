package Practico7.Ejercicio5;

import java.util.ArrayList;

public class Pelicula {
    private String titulo;
    private String sinopsis;
    private ArrayList<String> generos;
    private String director;
    private ArrayList<String> actores;
    private int anioEstreno;
    private double duracion;
    private int edad_minima;

    public Pelicula(String titulo, String sinopsis, String director, int anioEstreno, double duracion, int edad_minima){
        this.titulo = titulo;
        this.sinopsis = sinopsis;
        this.director = director;
        this.anioEstreno = anioEstreno;
        this.duracion = duracion;
        this.edad_minima = edad_minima;
        this.actores = new ArrayList<>();
        this.generos = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public boolean contieneGenero(String generoBuscado) {
        return generos.contains(generoBuscado);
    }

    public void addGeneros(String genero) {
        if(!generos.contains(genero)){
            generos.add(genero);
        }
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public boolean estaElActor(String actorBuscado) {
        return actores.contains(actorBuscado);
    }

    public void addActor(String actor) {
        if(!actores.contains(actor)){
            actores.add(actor);
        }
    }

    public int getAnioEstreno() {
        return anioEstreno;
    }

    public void setAnioEstreno(int anioEstreno) {
        this.anioEstreno = anioEstreno;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public int getEdad_minima() {
        return edad_minima;
    }

    public void setEdad_minima(int edad_minima) {
        this.edad_minima = edad_minima;
    }

    
}
