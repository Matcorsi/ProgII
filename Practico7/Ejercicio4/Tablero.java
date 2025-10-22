package Practico7.Ejercicio4;

import java.util.ArrayList;

public class Tablero {
    private int puntaje;
    private ArrayList<Ficha> fichas;
    private int dificultad;

    public Tablero(int puntaje){
        this.puntaje = puntaje;
        this.fichas = new ArrayList<>();
        this.dificultad = 0;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public void addFicha(Ficha ficha) {
        if(!fichas.contains(ficha)){
            fichas.add(ficha);
        }
    }

    public int getDificultad(){
        int totalFortaleza = 0;
        int totalDestruccion = 0;
        for(Ficha ficha : fichas){
            totalFortaleza += ficha.getFortaleza();
            totalDestruccion += ficha.getDestruccion();
        }
        dificultad = totalFortaleza/totalDestruccion;
        return dificultad;
    }

    public ArrayList<Ficha> buscarFicha(Filtro filtro){
        ArrayList<Ficha> fichasFiltradas = new ArrayList<>();
        for(Ficha ficha : fichas){
            if(filtro.cumple(ficha)){
                fichasFiltradas.add(ficha);
            }
        }
        return fichasFiltradas;
    }

    

}
