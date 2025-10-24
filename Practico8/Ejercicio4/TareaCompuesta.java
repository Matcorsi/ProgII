package Practico8.Ejercicio4;

import java.util.ArrayList;

public class TareaCompuesta extends Tarea{
    private ArrayList<Tarea> tareas;
    private String especialidad;

    public TareaCompuesta(String nombre, String especialidad){
        super(nombre);
        this.especialidad = especialidad;
        this.tareas = new ArrayList<>();
    }

    public void addTarea(Tarea tarea) {
        if(!tareas.contains(tarea)){
            tareas.add(tarea);
        }
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public ArrayList<Tarea> listaTareas(){
        return new ArrayList<>(tareas);
    }

    @Override
    public int getCosto(){
        int total = 0;
        for(Tarea tt : tareas){
            total += tt.getCosto();
        }
        return total;
    }

    @Override
    public double getTiempo(){
        double total = 0;
        for(Tarea tt : tareas){
            total += tt.getTiempo();
        }
        return total;
    }

    @Override
    public ArrayList<String> getTareas(){
        ArrayList<String> tareasCopia = new ArrayList<>();
        for(Tarea tt : tareas){
            tareasCopia.addAll(tt.getTareas());
        }
        return tareasCopia;
    }

    @Override
    public int contarTareasSimples(){
        int cantidad = 0;
        for(Tarea tt : tareas){
            cantidad += tt.contarTareasSimples();
        }
        return cantidad;
    }

    public String toString(){
        return this.getNombre() + ": ";
    }

    
}
