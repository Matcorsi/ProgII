package Practico6.Ejercicio1;

import java.time.LocalDate;
import java.util.ArrayList;

public class VideoClub {
    
    private String nombre;
    private ArrayList<Item> items;
    private ArrayList<Cliente> clientes;

    public VideoClub(String nombre){
        this.nombre = nombre;
        this.items = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void addCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }

    public void alquilarItem(Cliente cliente, Item item, LocalDate fecha_vencimiento){
        if(item.estaDisponible()){
            item.setFecha_alquiler(LocalDate.now());
            item.setFecha_vencimiento(fecha_vencimiento);
            item.alquilar();
            cliente.addAlquiler(item);
        } else {
            System.out.println("El item no esta disponible para alquilar");
        }
        
    }

    public ArrayList<Item> itemsAlquilados(){
        ArrayList<Item> listaAlquilado = new ArrayList<>();
        for(Cliente cliente : clientes){
            ArrayList<Item> itemsCliente = cliente.getAlquileres();
            for(Item item : itemsCliente){
                listaAlquilado.add(item);
            }
        }
        return listaAlquilado;
    }

    public ArrayList<Cliente> alquileresVencidos(){
        ArrayList<Cliente> listaClientes = new ArrayList<>();
        for(Cliente cliente : clientes){
            ArrayList<Item> itemsCliente = cliente.getAlquileres();
            for(Item item : itemsCliente){
                if(item.estaVencido()){
                    listaClientes.add(cliente);
                }
            }
        }
        return listaClientes;
    }

    

    

}
