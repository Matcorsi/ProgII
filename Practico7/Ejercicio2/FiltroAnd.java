package Practico7.Ejercicio2;

public class FiltroAnd implements Filtro{

    private Filtro f1;
    private Filtro f2;

    public FiltroAnd(Filtro f1, Filtro f2){
        this.f1 = f1;
        this.f2 = f2;
    }

    public boolean cumple(Documento doc){
        return f1.cumple(doc) && f2.cumple(doc);
    }
}
