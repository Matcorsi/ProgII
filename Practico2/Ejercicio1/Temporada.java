package Practico2.Ejercicio1;

import java.util.ArrayList;

public class Temporada {
    private int numero;
    private ArrayList<Episodio> temp;

    public Temporada(int numero){
        this.numero = numero;
        this.temp = new ArrayList<>();
    }

    public int getNumeroTemporada(){
        return this.numero;
    }

    public void setNumeroTemporada(int numero){
        this.numero = numero;
    }

    public void addEpisodio(Episodio episodio){
        this.temp.add(episodio);
    }

    public int cantidadEpisodiosVistos(){
        int cantidadVistos = 0;
        if(!this.temp.isEmpty()){
            for(int i = 0; i < this.temp.size(); i++){
                if(this.temp.get(i).fueVisto()){
                    cantidadVistos++;
                }
            }
        } else {
            System.out.println("La temporada no tiene episodios");
        }
        return cantidadVistos;
    }

    public double promCalifTemp(){
        double suma = 0.0;
        int valorDivisor = 0;
        int valor;
        double promedio;
        if(!this.temp.isEmpty()){
            for(int i = 0; i < this.temp.size(); i++){
                valor = this.temp.get(i).getCalificacion();
                if(valor >= 0 && valor <= 5){
                    suma += valor;
                    valorDivisor++;
                }
            }
        } else {
            System.out.println("La temporada no tiene episodios para saber su calificacion");
        }
        promedio = suma/valorDivisor;
        return promedio;
    }

    public boolean seVioCompleta(){
        boolean seVioCompleta = true;
        if(!this.temp.isEmpty()){
            int i = 0;
            while(i < this.temp.size() && seVioCompleta){
                if(this.temp.get(i).fueVisto()){
                    i++;
                } else {
                    seVioCompleta = false;
                }
            }
        } else {
            System.out.println("La temporada no tiene episodios para saber su calificacion");
        }
        return seVioCompleta;
    }
}
