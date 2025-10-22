package Practico7.Ejercicio5;

public class FiltroActor implements Filtro{
    private String actor;

    public FiltroActor(String actor){
        this.actor = actor;
    }

    @Override
    public boolean cumple(Pelicula pelicula){
        return pelicula.estaElActor(actor);
    }
}
