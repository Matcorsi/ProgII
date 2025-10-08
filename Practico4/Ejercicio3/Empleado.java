package Practico4.Ejercicio3;

public class Empleado {
    private String nombre;
    private String dni;
    private double salario;

    public Empleado(String nombre, String dni, double salario){
        this.nombre = nombre;
        this.dni = dni;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double calcularSalario(){
        System.out.println("Se ejecuto: calcularSalario de Empleado:");
        return this.getSalario();
    }

    public void mostrarSalario(){
        System.out.println("El salario del empleado: " + this.getNombre() + " es de:" + this.calcularSalario());
    }

    
}
