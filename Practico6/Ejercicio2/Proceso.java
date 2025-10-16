package Practico6.Ejercicio2;

public class Proceso {

    private String nombre;
    private double memoria;

    public Proceso(String nombre, double memoria){
        this.nombre = nombre;
        this.memoria = memoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getMemoria() {
        return memoria;
    }

    public void setMemoria(double memoria) {
        this.memoria = memoria;
    }

    public String toString(){
        return this.getNombre() + " Memoria: " + this.getMemoria();
    }

    
}
