package Practico5.Ejercicio8;

import java.util.ArrayList;

public class Evaluador {
    private String nombre;
    private ArrayList<String> conocimientos;
    private ArrayList<Trabajo> trabajos_asignados;

    public Evaluador(String nombre){
        this.nombre = nombre;
        this.conocimientos = new ArrayList<>();
        this.trabajos_asignados = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getConocimientos() {
        return conocimientos;
    }

    public void addConocimiento(String conocimiento) {
        this.conocimientos.add(conocimiento);
    }

    public void mostrarTrabajosAsignados() {
        if (trabajos_asignados.isEmpty()) {
            System.out.println(nombre + " no tiene trabajos asignados.");
        } else {
            System.out.println("Trabajos asignados a " + nombre + ":");
            for (Trabajo t : trabajos_asignados) {
                System.out.println(" - " + t.getNombre());
            }
        }
    }
  

    public void addTrabajo(Trabajo trabajo) {
        this.trabajos_asignados.add(trabajo);
    }

    public int cantidadDeTrabajosAsignados(){
        return this.trabajos_asignados.size();
    }

    
}
