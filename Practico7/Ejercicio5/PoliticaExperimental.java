package Practico7.Ejercicio5;

public class PoliticaExperimental implements PoliticaDeAdquisicion {

    @Override
    public boolean cumple(Pelicula pelicula) {
        // Películas que duren menos de 100 minutos o sean del género acción
        return pelicula.getDuracion() < 100 || pelicula.contieneGenero("acción");
    }
}
