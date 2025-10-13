package Practico5.Ejercicio7;

import java.util.ArrayList;

public class Empresa {
    private String nombre;
    private ArrayList<Empleado> empleados;

    public Empresa(String nombre){
        this.nombre = nombre;
        this.empleados = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void addEmpleados(Empleado empleado) {
        this.empleados.add(empleado);
    }

    public double totalSueldos(){
        double totalSueldos = 0;
        for(Empleado empleado : empleados){
            totalSueldos += empleado.getSueldo();
        }
        return totalSueldos;
    }

    
}
