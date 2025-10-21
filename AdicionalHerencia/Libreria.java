package AdicionalHerencia;

import java.util.ArrayList;

public class Libreria {
    private String nombre;
    private ArrayList<Articulo> stock;
    private ArrayList<Cliente> clientes;

    public Libreria(String nombre){
        this.nombre = nombre;
        this.stock = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Articulo> getStock() {
        return new ArrayList<Articulo>(stock);

    }

    public void addStock(Articulo articulo) {
        this.stock.add(articulo);
    }

    public ArrayList<Cliente> getClientes() {
        return new ArrayList<Cliente>(clientes);

    }

    public void addCliente(Cliente cliente) {
        boolean existe = false;
        String dni = cliente.getDni();
        for(Cliente cc : clientes){
            if(cc.getDni().equals(dni)){
                System.out.println("El cliente con dni: " + dni + ", ya esta registrado");
                existe = true;
            }
        }
        if(!existe){
            clientes.add(cliente);
            System.out.println("El cliente con dni: " + dni + ", fue agregado con exito!");
        }
    }

    public double precio(Articulo articulo, Cliente cliente){
        double descuento = articulo.getPrecio() * cliente.getDescuento();
        return articulo.getPrecio() - descuento;
    }

    public ArrayList<Cliente> clientesQueLesGusta(Articulo articulo){
        ArrayList<Cliente> clientesGusta = new ArrayList<>();
        for(Cliente cc : clientes){
            if(cc.leGusta(articulo)){
                clientesGusta.add(cc);
            }
        }
        return clientesGusta;
    }

    
}
