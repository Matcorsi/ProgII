package ParcialQuequen;

public class FiltroVolumenMas implements Filtro{
    private double volumen;

    public FiltroVolumenMas(double volumen){
        this.volumen = volumen;
    }

    @Override
    public boolean cumple(Producto prod){
        return prod.getVolumen() > volumen;
    }

}
