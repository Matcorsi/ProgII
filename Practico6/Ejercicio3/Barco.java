package Practico6.Ejercicio3;

public class Barco implements Comparable<Barco>{
    private String nombre;
    private double capacidad;

    public Barco(String nombre, double capacidad){
        this.nombre = nombre;
        this.capacidad = capacidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public int compareTo(Barco otro){
        return Double.compare(otro.getCapacidad(), this.getCapacidad());
    }

    @Override
    public String toString(){
        return "Barco: " + this.getNombre() + " | Capacidad: " + this.getCapacidad();
    }

    
}
