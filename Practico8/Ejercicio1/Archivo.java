package Practico8.Ejercicio1;

import java.time.LocalDate;

public class Archivo extends ElementoSA{
    private LocalDate fechaModificacion;
    private double tamanio;

    public Archivo(String nombre, LocalDate fechaCreacion, double tamanio){
        super(nombre, fechaCreacion);
        this.tamanio = tamanio;
        this.fechaModificacion = LocalDate.now();
    }

     public LocalDate getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(LocalDate fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    @Override
    public double getTamanio() {
        return tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public int cantElementoSA(){
        return 1;
    }

}   
