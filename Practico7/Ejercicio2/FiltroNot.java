package Practico7.Ejercicio2;

public class FiltroNot implements Filtro{

    private Filtro filtro;

    public FiltroNot(Filtro filtro){
        this.filtro = filtro;
    }

    public boolean cumple(Documento doc){
        return !filtro.cumple(doc);
    }
}
