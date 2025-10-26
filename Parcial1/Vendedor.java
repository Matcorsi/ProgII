package Parcial1;

import java.util.ArrayList;

public class Vendedor extends Empleado{
    private String apellido;
    private int edad;
    private ArrayList<Venta> ventas;

    public Vendedor(String nombre, String apellido, int edad){
        super(nombre);
        this.apellido = apellido;
        this.edad = edad;
        this.ventas = new ArrayList<>();
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void addVenta(Venta nuevaVenta) {
        if(!ventas.contains(nuevaVenta)){
            ventas.add(nuevaVenta);
        }
    }

    public double gananciasTotales(){
        double total = 0;
        for(Venta vv : ventas){
            total += vv.ganancias();
        }
        return total;
    }

    
}
