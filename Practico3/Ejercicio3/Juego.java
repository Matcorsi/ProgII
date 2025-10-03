package Practico3.Ejercicio3;

import java.util.ArrayList;

public class Juego {
    private ArrayList<Jugador> jugadores;
    private ArrayList<Personaje> cartas;

    public Juego(){
        this.cartas = new ArrayList<>();
        this.jugadores = new ArrayList<>();
    }

    public void addCarta(Personaje personaje){
        this.cartas.add(personaje);
    }

    public void addJugador(Jugador jugador){
        this.jugadores.add(jugador);
    }

    public void combate(Personaje pers1, Personaje pers2){
        
    }
}
