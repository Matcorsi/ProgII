package Practico8.Ejercicio4;

import java.util.ArrayList;

public class TareaSimple extends Tarea{
    private int costo;
    private double tiempo;
    private int sumaPorTarea;

    public TareaSimple(String nombre, int costo, double tiempo, int sumaPorTarea){
        super(nombre);
        this.costo = costo;
        this.tiempo = tiempo;
        this.sumaPorTarea = sumaPorTarea;
    }

    @Override
    public double getTiempo(){
        return this.tiempo + sumaPorTarea;
    }

    @Override
    public int getCosto(){
        return costo;
    }

    @Override
    public ArrayList<String> getTareas(){
        ArrayList<String> tarea = new ArrayList<>();
        tarea.add(this.getNombre());
        return tarea;
    }

    @Override
    public int contarTareasSimples(){
        return 1;
    }

}
