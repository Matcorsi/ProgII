package Parcial1;

import java.util.ArrayList;

public class Vendedor {
    private String nombre;
    private String apellido;
    private int edad;
    private ArrayList<Venta> lista_ventas;

    public Vendedor(String nombre, String apellido, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.lista_ventas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    
}
