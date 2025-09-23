package Pract2_Ejer4;

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

    public ArrayList<Usuario> getSocios(){
        return this.socios;
    }

    
}
