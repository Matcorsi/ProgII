package Practico8.Ejercicio1;

import java.time.LocalDate;
import java.util.ArrayList;

public class Directorio extends ElementoSA{
    private ArrayList<ElementoSA> elementos;
    
    public Directorio(String nombre, LocalDate fechaCreacion){
        super(nombre, fechaCreacion);
        this.elementos = new ArrayList<>();
    }

    public void addElementoSA(ElementoSA elemento){
        if(!elementos.contains(elemento)){
            elementos.add(elemento);
        }
    }

    public ArrayList<ElementoSA> getElementos(){
        return new ArrayList<>(elementos);
    }

    @Override
    public double getTamanio(){
        double tamanioTotal = 0;
        for(ElementoSA elem : elementos){
            tamanioTotal += elem.getTamanio();
        }
        return tamanioTotal;
    }

    @Override
    public int cantElementoSA(){
        int cantidad = 0;
        for(ElementoSA elem : elementos){
            cantidad += elem.cantElementoSA();
        }
        return cantidad + 1;
    }
}
