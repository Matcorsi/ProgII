package Parcial1;

import java.time.LocalDate;

public class Venta {
    private LocalDate fecha;
    private String codigo;
    private String dni_comprador;
    private double monto;
    private int cantidad;

    public Venta(LocalDate fecha, String codigo, String dni_comprador, double monto, int cantidad){
        this.fecha = fecha;
        this.codigo = codigo;
        this.dni_comprador = dni_comprador;
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

    public String getDni_comprador() {
        return dni_comprador;
    }

    public void setDni_comprador(String dni_comprador) {
        this.dni_comprador = dni_comprador;
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

    
}
