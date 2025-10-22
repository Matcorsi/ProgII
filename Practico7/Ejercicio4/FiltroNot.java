package Practico7.Ejercicio4;

public class FiltroNot implements Filtro{
    private Filtro f1;

    public FiltroNot(Filtro f1){
        this.f1 = f1;
    }

    public boolean cumple(Ficha ficha){
        return !f1.cumple(ficha);
    }
}

