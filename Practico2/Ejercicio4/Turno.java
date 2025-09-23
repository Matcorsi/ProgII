package Pract2_Ejer4;

import java.time.LocalDate;
import java.time.LocalTime;

public class Turno {
    private int id_turno;
    private LocalDate fecha;
    private LocalTime hora;
    private Usuario usuario;
    private Cancha cancha;

    public Turno(int id_turno, LocalDate fecha, LocalTime hora, Usuario usuario, Cancha cancha){
        this.id_turno = id_turno;
        this.fecha = fecha;
        this.hora = hora;
        this.usuario = usuario;
        this.cancha = cancha;
    }

    public void setIdTurno(int id_turno){
        this.id_turno = id_turno;
    }

    public int getIdTurno(){
        return this.id_turno;
    }

    public void setFecha(LocalDate fecha){
        this.fecha = fecha;
    }

    public LocalDate getFecha(){
        return this.fecha;
    }

    public void setHora(LocalTime hora){
        this.hora = hora;
    }

    public LocalTime getHora(){
        return this.hora;
    }

    public void setUsurio(Usuario usuario){
        this.usuario = usuario;
    }

    public Usuario getUsuario(){
        return this.usuario;
    }

    public void setCancha(Cancha cancha){
        this.cancha = cancha;
    }

    public Cancha getCancha(){
        return this.cancha;
    }

}
