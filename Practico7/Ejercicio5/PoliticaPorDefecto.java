package Practico7.Ejercicio5;

public class PoliticaPorDefecto implements PoliticaDeAdquisicion {

    @Override
    public boolean cumple(Pelicula pelicula) {
        // Películas cuya duración sea < 120 y NO sean comedia
        if (pelicula.getDuracion() < 120 && !pelicula.contieneGenero("comedia")) {
            return true;
        }
        // Películas posteriores a 2017 salvo si son infantil o documental
        if (pelicula.getAnioEstreno() > 2017 && 
           (!pelicula.contieneGenero("infantil") && !pelicula.contieneGenero("documental"))) {
            return true;
        }
        return false;
    }
}
