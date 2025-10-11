package Practico5.Ejercicio4;

import java.util.ArrayList;

public class Alumno {
    private String nombre;
    private ArrayList<String> cualidades;
    private ArrayList<Alumno> familiares;
    private Casa casa;

    public Alumno(String nombre){
        this.nombre = nombre;
        this.casa = null;
        this.cualidades = new ArrayList<>();
        this.familiares = new ArrayList<>();
    }

    public void setNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void addCualidad(String cualidad){
        this.cualidades.add(cualidad);
    }

    public ArrayList<String> getCualidades(){
        return this.cualidades;
    }

    public void addFamiliar(Alumno familiar){
        this.familiares.add(familiar);
    }

    public ArrayList<Alumno> getFamiliares(){
        return this.familiares;
    }

    public void asignarCasa(Casa casa_asignada){
        this.casa = casa_asignada;
    }

    public Casa getCasa(){
        return this.casa;
    }
}
