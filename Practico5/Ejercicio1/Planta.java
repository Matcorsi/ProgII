package Practico5.Ejercicio1;

import java.time.LocalDate;

public class Planta { 
    
    private static int contador = 0; // Variable de clase: común a todas las plantas

    private String nombre_cientifico;
    private String nombre;
    private String pais_origen;
    private LocalDate fecha_compra;
    private int id;

    public Planta(String nombre_cientifico, String nombre, String pais_origen, LocalDate fecha_compra){
        this.nombre_cientifico = nombre_cientifico;
        this.nombre = nombre;
        this.pais_origen = pais_origen;
        this.fecha_compra = fecha_compra;
        this.id = ++contador;
    }

    public String getNombre_cientifico() {
        return nombre_cientifico;
    }

    public void setNombre_cientifico(String nombre_cientifico) {
        this.nombre_cientifico = nombre_cientifico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais_origen() {
        return pais_origen;
    }

    public void setPais_origen(String pais_origen) {
        this.pais_origen = pais_origen;
    }

    public LocalDate getFecha_compra() {
        return fecha_compra;
    }

    public void setFecha_compra(LocalDate fecha_compra) {
        this.fecha_compra = fecha_compra;
    }

    public int getId() {
        return id;
    }

     @Override
    public String toString() {
        return "Planta [ID=" + id + 
               ", Nombre Científico=" + this.nombre_cientifico + 
               ", Nombre Común=" + this.nombre + 
               ", País de Origen=" + this.pais_origen + 
               ", Fecha de Compra=" + this.fecha_compra + "]";
    }
    
}   
