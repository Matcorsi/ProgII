package Recu2;

public class CostoFijo implements Costo{
    private double valor;

    public CostoFijo(double valor){
        this.valor = valor;
    }

    @Override
    public double getCosto(Trabajo trabajo){
        return valor;
    }
}
