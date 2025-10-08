package Practico4.Ejercicio6;

public class Empleado extends Persona{

    private int numero_legajo;
    private double sueldo;

    public Empleado(String nombre, String apellido, int edad, int numero_legajo, double sueldo){
        super(nombre, apellido, edad);
        this.numero_legajo = numero_legajo;
        this.sueldo = sueldo;
    }

    public int getNumero_legajo() {
        return numero_legajo;
    }

    public void setNumero_legajo(int numero_legajo) {
        this.numero_legajo = numero_legajo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        super.toString();
        return "Cargo: Empleado " + " | Legajo: " + numero_legajo + " | Sueldo: " + sueldo;
    }
}
