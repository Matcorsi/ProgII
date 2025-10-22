package Practico7.Ejercicio5;

public class FiltroContengaPalabraTitulo implements Filtro{
    private String palabra;

    public FiltroContengaPalabraTitulo(String palabra){
        this.palabra = palabra;
    }

    @Override
    public boolean cumple(Pelicula pelicula){
        return pelicula.getTitulo().contains(palabra);
    }
}
