package Practico5.Ejercicio5;

public class Pastura extends Cereal{

    public Pastura(String nombre){
        super(nombre);
    }

    @Override
    public boolean puedeSembrar(Lote lote){
        return super.puedeSembrar(lote) && lote.getSuperficie() >= 50;
    }
}
