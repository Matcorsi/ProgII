package Parcial1;

import java.util.ArrayList;

public class GrupoVendedores extends Trabajador{

    private ArrayList<Trabajador> empleados;

    public GrupoVendedores(String nombre){
        super(nombre);
        this.empleados = new ArrayList<>();
    }

    public ArrayList<Trabajador> getEmpleados() {
        return empleados;
    }

    public void addEmpleados(Trabajador tt) {
        this.empleados.add(tt);
    }

    @Override
    public double totalGanancias(){
        double total = 0;
        for(Trabajador ee : empleados){
            total += ee.totalGanancias();
        }
        return total;
    }
    
}
