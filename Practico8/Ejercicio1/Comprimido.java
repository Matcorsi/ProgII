package Practico8.Ejercicio1;

import java.time.LocalDate;

public class Comprimido extends Directorio{
    private double tasaCompresion;

    public Comprimido(String nombre, LocalDate fechaCreacion, double tasaCompresion){
        super(nombre, fechaCreacion);
        this.tasaCompresion = tasaCompresion;
    }

    @Override
    public double getTamanio(){
        return super.getTamanio()/tasaCompresion;
    }


}
