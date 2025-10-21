package Practico6.Ejercicio3;

import java.time.LocalDate;

public class Camion implements Comparable<Camion>{
    private String patente;
    private LocalDate fecha_carga;

    public Camion(String patente, LocalDate fecha_carga){
        this.patente = patente;
        this.fecha_carga = fecha_carga;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public LocalDate getFecha_carga() {
        return fecha_carga;
    }

    public void setFecha_carga(LocalDate fecha_carga) {
        this.fecha_carga = fecha_carga;
    }

    @Override
    public String toString(){
        return "Camion: " + this.getPatente() + " | fecha de carga: " + this.getFecha_carga();
    }

    @Override
    public int compareTo(Camion camion){
        return this.fecha_carga.compareTo(camion.fecha_carga);
    }

    
}
