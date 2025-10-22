package Practico7.Ejercicio3;

public class FiltroOr implements Filtro{
    private Filtro f1;
    private Filtro f2;

    public FiltroOr(Filtro f1, Filtro f2){
        this.f1 = f1;
        this.f2 = f2;
    }

    public boolean cumple(Planta planta){
        return f1.cumple(planta) || f2.cumple(planta);
    }
}
