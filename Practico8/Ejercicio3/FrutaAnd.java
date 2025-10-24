package Practico8.Ejercicio3;

public class FrutaAnd implements Comer{
    private Comer f1;
    private Comer f2;

    public FrutaAnd(Comer f1, Comer f2){
        this.f1 = f1;
        this.f2 = f2;
    }

    @Override
    public int getValorFuerza(Personaje personaje){
        return f1.getValorFuerza(personaje) + f2.getValorFuerza(personaje);
    }
}
