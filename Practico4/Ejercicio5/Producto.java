package Practico4.Ejercicio5;

import java.time.LocalDate;

public class Producto {
    private LocalDate fecha_vencimiento;
    private int numero_lote;
    private LocalDate fecha_envasado;
    private String granja_origen;
    
    public Producto(LocalDate fecha_vencimiento, int numero_lote, LocalDate fecha_envasado, String granja_origen){
        this.fecha_vencimiento = fecha_vencimiento;
        this.numero_lote = numero_lote;
        this.fecha_envasado = fecha_envasado;
        this.granja_origen = granja_origen;
    }

    public LocalDate getFecha_vencimiento() {
        return fecha_vencimiento;
    }
    public void setFecha_vencimiento(LocalDate fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }
    public int getNumero_lote() {
        return numero_lote;
    }
    public void setNumero_lote(int numero_lote) {
        this.numero_lote = numero_lote;
    }

    public LocalDate getFecha_envasado() {
        return fecha_envasado;
    }

    public void setFecha_envasado(LocalDate fecha_envasado) {
        this.fecha_envasado = fecha_envasado;
    }

    public String getGranja_origen() {
        return granja_origen;
    }

    public void setGranja_origen(String granja_origen) {
        this.granja_origen = granja_origen;
    }
    
    public void imprimirEtiqueta(){
        System.out.println("Numero lote: " + this.getNumero_lote() +
                        " | Fecha vencimiento: " + this.getFecha_vencimiento() +
                        " | Fecha envasado: " + this.getFecha_envasado() +
                        " | Granja de origen: " + this.getGranja_origen());
    }
    
}
