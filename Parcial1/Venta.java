package Parcial1;

import java.time.LocalDate;

public class Venta {
    private LocalDate fecha;
    private String codigo;
    private String dni;
    private double monto;
    private int cantidad;

    public Venta(String codigo, String dni, double monto, int cantidad){
        this.fecha = LocalDate.now();
        this.codigo = codigo;
        this.dni = dni;
        this.monto = monto;
        this.cantidad = cantidad;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double ganancias(){
        return monto * cantidad;
    }

    
}
