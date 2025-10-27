package Practico9.Ejercicio2;

public class CondDuracion implements Condicion{
    public double duracion;

    public CondDuracion(double duracion){
        this.duracion = duracion;
    }

    @Override
    public boolean cumple(Coleccion elem){
        return elem.duracionTotal() > duracion;
    }
}
