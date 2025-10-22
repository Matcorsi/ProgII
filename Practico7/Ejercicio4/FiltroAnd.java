package Practico7.Ejercicio4;

public class FiltroAnd implements Filtro{
    private Filtro f1;
    private Filtro f2;

    public FiltroAnd(Filtro f1, Filtro f2){
        this.f1 = f1;
        this.f2 = f2;
    }

    public boolean cumple(Ficha ficha){
        return f1.cumple(ficha) && f2.cumple(ficha);
    }
}
