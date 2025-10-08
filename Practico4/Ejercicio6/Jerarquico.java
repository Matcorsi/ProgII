package Practico4.Ejercicio6;

import java.util.ArrayList;

public class Jerarquico extends Empleado{

    private ArrayList<Empleado> empleados;

    public Jerarquico(String nombre, String apellido, int edad, int numero_legajo, double sueldo){
        super(nombre, apellido, edad, numero_legajo, sueldo);
        this.empleados = new ArrayList<>();
    }

    public void addEmpleado(Empleado empleado){
        this.empleados.add(empleado);
    }

    public ArrayList<Empleado> getEmpleados(){
        return this.empleados;
    }

    public void verEmpleadoACargo(){
        if(!this.empleados.isEmpty()){
            for(Empleado empleado : empleados){
                System.out.println("Nombre: " + empleado.getNombre() + " | Numero legajo: " + empleado.getNumero_legajo());
            }
        }
    }

    @Override
    public String toString() {
        super.toString();
        return "Cargo: Jerárquico " + " | Legajo: " + getNumero_legajo() +
                " | Sueldo: " + getSueldo() + " | Empleados a cargo: " + empleados.size();
    }


}
