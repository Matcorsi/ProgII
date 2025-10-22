package Practico7.Ejercicio1;

public class CondicionAnd implements Condicion{

    private Condicion cond1;
    private Condicion cond2;

    public CondicionAnd(Condicion cond1, Condicion cond2){
        this.cond1 = cond1;
        this.cond2 = cond2;
    }

    public boolean cumple(Producto prod){
        return cond1.cumple(prod) && cond2.cumple(prod);
    }
}
