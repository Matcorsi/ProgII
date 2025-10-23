package Parcial1;

import java.util.ArrayList;

public class Vendedor extends Trabajador{
    private String apellido;
    private int edad;
    private ArrayList<Venta> lista_ventas;

    public Vendedor(String nombre, String apellido, int edad){
        super(nombre);
        this.apellido = apellido;
        this.edad = edad;
        this.lista_ventas = new ArrayList<>();
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

    public ArrayList<Venta> getLista_ventas() {
        return lista_ventas;
    }

    public void addLista_ventas(Venta venta) {
        this.lista_ventas.add(venta);
    }

    @Override
    public double totalGanancias(){
        double total = 0;
        for(Venta venta : lista_ventas){
            total += venta.ganancias();
        }
        return total;
    }

    
}
