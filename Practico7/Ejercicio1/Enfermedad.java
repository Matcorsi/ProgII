package Practico7.Ejercicio1;

import java.util.ArrayList;

public class Enfermedad {
    private String nombre;
    private ArrayList<String> estados_patologicos;

    public Enfermedad(String nombre){
        this.nombre = nombre;
        this.estados_patologicos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getEstados_patologicos() {
        return new ArrayList<>(estados_patologicos);
    }

    public void addEstados_patologicos(String estado_patologico) {
        if(!estados_patologicos.contains(estado_patologico)){
            estados_patologicos.add(estado_patologico);
        } else {
            System.out.println("La patologia ya existe");
        }
    }

    @Override
    public boolean equals(Object enfermedad){
        Enfermedad otro = (Enfermedad) enfermedad; 
        return this.getNombre().equals(otro.getNombre());
    }

}
