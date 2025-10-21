package Practico6.Ejercicio3;

import java.util.LinkedList;
import java.util.PriorityQueue;

public class Puerto {
    private String nombre;
    private PriorityQueue<Barco> colaBarcos;
    private LinkedList<Camion> colaCamiones;

    public Puerto(String nombre){
        this.nombre = nombre;
        this.colaBarcos = new PriorityQueue<>();
        this.colaCamiones =  new LinkedList<>();
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public Barco getBarco(){
        return this.colaBarcos.poll();
    }

    public Camion getCamion(){
        return this.colaCamiones.poll();
    }

    public void addBarco(Barco nuevoBarco){
        this.colaBarcos.add(nuevoBarco);
    }

    public void addCamion(Camion nuevoCamion){
        if(!this.colaBarcos.isEmpty()){
            cargarBarco(nuevoCamion);
        } else {
            this.colaCamiones.add(nuevoCamion);
        }
    }

    public void cargarBarco(Camion camion){
        if(!colaBarcos.isEmpty()){
            Barco barcoCarga = colaBarcos.poll();
            System.out.println("El camion: " + camion.getPatente() + " , fue cargado en el barco: " + barcoCarga.getNombre());
        } else {
            System.out.println("Aun no hay barcos para cargar!");
        }
    }

    public void descargarCamiones(){
        while(!this.colaCamiones.isEmpty()){
            Camion camion = this.colaCamiones.poll();
            System.out.println("El camion: " + camion.getPatente() + " , esta listo para descargar");
            cargarBarco(camion);
        } 
        if(colaCamiones.isEmpty()){
            System.out.println("No hay camiones para descargar!");
        }
    }

    public void mostrarColas() {
        System.out.println("\nBarcos en espera:");
        colaBarcos.forEach(System.out::println);
        System.out.println("\nCamiones en espera:");
        colaCamiones.forEach(System.out::println);
    }


}
