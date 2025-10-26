package Parcial1;

import java.util.ArrayList;

public class EquipoVendedores extends Empleado{
    private ArrayList<Empleado> trabajadores;

    public EquipoVendedores(String nombre){
        super(nombre);
        this.trabajadores = new ArrayList<>();
    }

    public void addTrabajador(Empleado trabajador){
        if(!trabajadores.contains(trabajador)){
            trabajadores.add(trabajador);
        }
    }

    public double gananciasTotales(){
        double total = 0;
        for(Empleado tt : trabajadores){
            total += tt.gananciasTotales();
        }
        return total;
    }


}
