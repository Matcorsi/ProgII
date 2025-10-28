package ParcialQuequen;

public class FiltroCaracteristica implements Filtro{
    private String caracteristica;

    public FiltroCaracteristica(String caracteristica){
        this.caracteristica = caracteristica;
    }

    @Override
    public boolean cumple(Producto prod){
        return prod.getCaracteristicas().contains(caracteristica);
    }
}
