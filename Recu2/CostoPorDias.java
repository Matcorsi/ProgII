package Recu2;

public class CostoPorDias implements Costo{
    private int valor;

    public CostoPorDias(int valor){
        this.valor = valor;
    }

    @Override
    public double getCosto(Trabajo trabajo){
        return valor*trabajo.cantidadDias();
    }
}
