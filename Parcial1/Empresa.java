package Parcial1;

import java.util.ArrayList;

public class Empresa {
    private String nombre;
    private ArrayList<Trabajador> empleados;

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

    public ArrayList<Trabajador> getEmpleados() {
        return empleados;
    }

    public void addEmpleados(Trabajador ee) {
        this.empleados.add(ee);
    }

    public ArrayList<Vendedor> rankingVendedores(){
        ArrayList<Vendedor> ranking = new ArrayList<>();
        return ranking;
    }

    

    
}
