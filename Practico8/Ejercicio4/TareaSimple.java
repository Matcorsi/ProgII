package Practico8.Ejercicio4;

import java.util.ArrayList;

public class TareaSimple extends Tarea{
    private int costo;
    private double tiempo;

    public TareaSimple(String nombre, int costo, double tiempo){
        super(nombre);
        this.costo = costo;
        this.tiempo = tiempo;
    }

    @Override
    public double getTiempo(){
        return this.tiempo + 10;
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

}
