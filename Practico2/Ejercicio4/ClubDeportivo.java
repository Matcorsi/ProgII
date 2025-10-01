package Practico2.Ejercicio4;

import java.util.ArrayList;

public class ClubDeportivo {
    private ArrayList<Turno> turnos;
    private ArrayList<Usuario> socios;

    public ClubDeportivo(){
        this.turnos = new ArrayList<>();
        this.socios = new ArrayList<>();
    }

    public void addTurno(Turno turno){
        this.turnos.add(turno);
    }

    public ArrayList<Turno> getTurnos(){
        return this.turnos;
    }

    public ArrayList<Usuario> getSocios(){
        return this.socios;
    }

    public void addSocio(Usuario nuevoSocio){
        if(!this.socios.contains(nuevoSocio)){
            this.socios.add(nuevoSocio);
        } else {
            System.out.println("Ya es un socio");
        }
    }

    public String toString(){
        return "Turnos: " + this.getTurnos() + " | Socios: " + this.getSocios();
    }

    
}
