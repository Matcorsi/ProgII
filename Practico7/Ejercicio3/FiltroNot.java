package Practico7.Ejercicio3;

public class FiltroNot implements Filtro{
    private Filtro f1;

    public FiltroNot(Filtro f1){
        this.f1 = f1;
    }

    public boolean cumple(Planta planta){
        return !f1.cumple(planta);
    }
}
