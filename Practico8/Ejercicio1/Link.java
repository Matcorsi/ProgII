package Practico8.Ejercicio1;

import java.time.LocalDate;

public class Link extends ElementoSA{

    public Link(String nombre, LocalDate fechaCreacion){
        super(nombre, fechaCreacion);
    }

    @Override
    public double getTamanio(){
        return 1;
    }

    @Override
    public int cantElementoSA(){
        return 1;
    }
}
