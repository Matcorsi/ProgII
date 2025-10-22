package Practico7.Ejercicio5;

import java.util.ArrayList;

public class Plataforma {
    private ArrayList<Pelicula> peliculas;
    private PoliticaDeAdquisicion politica;

    public Plataforma(){
        this.peliculas = new ArrayList<>();
        this.politica = new PoliticaPorDefecto();
    }

    public ArrayList<Pelicula> getPeliculas() {
        return new ArrayList<>(peliculas);
    }

    public void addPelicula(Pelicula pelicula) {
        if(!peliculas.contains(pelicula)){
            peliculas.add(pelicula);
        }
    }

    public ArrayList<Pelicula> buscarPelicula(Filtro filtro){
        ArrayList<Pelicula> peliculasFiltradas = new ArrayList<>();
        for(Pelicula peli : peliculas){
            if(filtro.cumple(peli)){
                peliculasFiltradas.add(peli);
            }
        }
        return peliculasFiltradas;
    }

    public boolean esRentable(Pelicula pelicula) {
        return politica.cumple(pelicula);
    }

    public void setPolitica(PoliticaDeAdquisicion nuevaPolitica) {
        this.politica = nuevaPolitica;
    }

    
}
