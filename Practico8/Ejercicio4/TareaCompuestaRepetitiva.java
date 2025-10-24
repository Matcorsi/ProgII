package Practico8.Ejercicio4;

import java.util.ArrayList;

public class TareaCompuestaRepetitiva extends TareaCompuesta{
    private int cant_repeticiones;

    public TareaCompuestaRepetitiva(String nombre, String especialidad, int cant_repeticiones){
        super(nombre, especialidad);
        this.cant_repeticiones = cant_repeticiones;
    }

    public int getCant_repeticiones() {
        return cant_repeticiones;
    }

    public void setCant_repeticiones(int cant_repeticiones) {
        this.cant_repeticiones = cant_repeticiones;
    }

    @Override
    public int getCosto(){
        int total = super.getCosto();
        return total * cant_repeticiones;
    }

    @Override
    public double getTiempo(){
        double total = super.getTiempo();
        return total * cant_repeticiones;
    }

     @Override
    public ArrayList<String> getTareas(){
        ArrayList<String> copiaTareas = new ArrayList<>();
        for(int i = 0; i < cant_repeticiones; i++){
            for(Tarea tt : this.listaTareas()){
                copiaTareas.addAll(tt.getTareas());
            }
        }
        return copiaTareas;
    }

    @Override
    public int contarTareasSimples() {
        return super.contarTareasSimples() * getCant_repeticiones();
    }


    
}
