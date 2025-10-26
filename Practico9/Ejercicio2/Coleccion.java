package Practico9.Ejercicio2;

import java.util.ArrayList;

public abstract class Coleccion {
    private String nombre;
    private ArrayList<Coleccion>  elementos;

    public Coleccion(String nombre){
        this.nombre = nombre;
        this.elementos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void addElemento(Coleccion elemento) {
        if(!elementos.contains(elemento)){
            elementos.add(elemento);
        }
    }

    public ArrayList<Coleccion> getColeccion(){
        return new ArrayList<>(elementos);
    }

    public void deleteElemento(Coleccion elemento){
        if(elementos.contains(elemento)){
            elementos.remove(elemento);
        }
    }

    public double duracionTotal(){
        double total = 0;
        for(Coleccion elem : elementos){
            total += elem.duracionTotal();
        }
        return total;
    }

    public ArrayList<Coleccion> buscar(Condicion cond){
        ArrayList<Coleccion> retorno = new ArrayList<>();
        for(Coleccion elem : elementos){
            if(cond.cumple(elem)){
                retorno.add(elem);
            }
        }
        return retorno;
    }

    
}
