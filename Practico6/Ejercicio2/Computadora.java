package Practico6.Ejercicio2;

public class Computadora {
    private String nombre;
    private double velocidad;

    public Computadora(String nombre, double velocidad){
        this.nombre = nombre;
        this.velocidad = velocidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public void ejecutar(Proceso proceso){
        System.out.println("Ejecutando proceso: " + proceso.toString() + " en la PC: " + this.toString());
    }

    public String toString(){
        return this.getNombre() + " Velocidad: " + this.getVelocidad();
    }

    
}
