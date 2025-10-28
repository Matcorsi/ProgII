package ParcialQuequen;

public class FiltroOr implements Filtro{
    private Filtro f1;
    private Filtro f2;

    public FiltroOr(Filtro f1, Filtro f2){
        this.f1 = f1;
        this.f2 = f2;
    }

    @Override
    public boolean cumple(Producto prod){
        return f1.cumple(prod) || f2.cumple(prod);
    }
}
