package Practico5.Ejercicio4;

import java.util.ArrayList;

public class Casa {

    private String nombre;
    protected ArrayList<Alumno> alumnos;
    protected ArrayList<String> cualidades_casa;
    private int capacidad;
    private Casa casa_enemiga;

    public Casa(String nombre, int capacidad){
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.casa_enemiga = null;
        this.alumnos = new ArrayList<>();
        this.cualidades_casa = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Alumno> getAlumnos() {
        return this.alumnos;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void setCasaEnemiga(Casa casa_enemiga){
        this.casa_enemiga = casa_enemiga;
    }

    public Casa getCasaEnemiga(){
        return this.casa_enemiga;
    }

    public void addCualidadCasa(String cualidad){
        this.cualidades_casa.add(cualidad);
    }

    public ArrayList<String> getCualidadesCasa(){
        return this.cualidades_casa;
    }

    public void addAlumno(Alumno alumno) {
        if(alumno.getCasa() == null){
            int tamanio = this.alumnos.size();
            if(tamanio < this.getCapacidad()){
                if(esAceptado(alumno)){
                    asignarCasaAlumno(alumno);
                } else {
                    System.out.println("El alumno no contiene todas las cualidades de la casa");
                }
            } else {
                System.out.println("La casa esta llena, no hay capacidad disponible");
            }  
        } else {
            System.out.println("El alumno ya cuenta con una casa asignada");
        }   
    }

    public void asignarCasaAlumno(Alumno alumno){
        this.alumnos.add(alumno);
        alumno.asignarCasa(this);
    };

    public boolean esAceptado(Alumno alumno){
        for(String cualidad : cualidades_casa){
            if(!(alumno.getCualidades().contains(cualidad))){
                return false;
            };
        }
        return true;
    }

    
}
