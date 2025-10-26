package Practico9.Ejercicio1;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class ElementoSA {
    private String nombre;
    private LocalDate fechaCreacion;
    private LocalDate fechaModificacion;


    public ElementoSA(String nombre){
        this.nombre = nombre;
        this.fechaCreacion = LocalDate.now();
        this.fechaModificacion = LocalDate.now();
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public LocalDate getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(){
        this.fechaModificacion = LocalDate.now();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        setFechaModificacion();
        this.nombre = nombre;
    }

    public abstract double getTamanio();

    public ArrayList<ElementoSA> buscar(Condicion cond){
        ArrayList<ElementoSA> retorno = new ArrayList<>();
        if(cond.cumple(this)){
            retorno.add(this);
        }
        return retorno;
    };


}
