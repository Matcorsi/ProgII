package Practico7.Ejercicio5;

public class FiltroGenero implements Filtro{
    private String genero;

    public FiltroGenero(String genero){
        this.genero = genero;
    }

    @Override
    public boolean cumple(Pelicula pelicula){
        return pelicula.contieneGenero(genero);
    }
}
