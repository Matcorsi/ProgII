package Practico6.Ejercicio1;

import java.time.LocalDate;

public abstract class Item {

    private String nombre;
    private LocalDate fecha_alquiler;
    private LocalDate fecha_vencimiento;
    
    public Item(String nombre){
        this.nombre = nombre;
        this.fecha_alquiler = null;
        this.fecha_vencimiento = null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFecha_alquiler() {
        return fecha_alquiler;
    }

    public void setFecha_alquiler(LocalDate fecha_alquiler) {
        this.fecha_alquiler = fecha_alquiler;
    }

    public LocalDate getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    public void setFecha_vencimiento(LocalDate fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }

    public boolean estaVencido() {
        LocalDate hoy = LocalDate.now();
        return this.fecha_vencimiento != null && this.fecha_vencimiento.isBefore(hoy);
    }

    
    // public boolean estadoDelAlquiler(){
    //     LocalDate hoy = LocalDate.now();
    //     return this.fecha_vencimiento.isBefore(hoy); // isAfter(fecha) → devuelve true si la fecha del objeto es posterior a la pasada como parámetro.
    //                                                 // isBefore(fecha) → devuelve true si es anterior.
    //                                                 // isEqual(fecha) → devuelve true si son iguales.
    // }

    public abstract boolean estaDisponible();

    public abstract void alquilar();

    
}
