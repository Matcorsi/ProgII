package Practico7.Ejercicio5;

public class FiltroNot implements Filtro{
    private Filtro f1;

    public FiltroNot(Filtro f1){
        this.f1 = f1;
    }

    public boolean cumple(Pelicula pelicula){
        return !f1.cumple(pelicula);
    }
}

