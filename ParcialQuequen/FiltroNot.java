package ParcialQuequen;

public class FiltroNot implements Filtro{
    private Filtro f1;

    public FiltroNot(Filtro f1){
        this.f1 = f1;
    }

    @Override
    public boolean cumple(Producto prod){
        return !f1.cumple(prod);
    }
}
