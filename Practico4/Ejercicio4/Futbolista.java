package Practico4.Ejercicio4;

import java.time.LocalDate;

public class Futbolista extends Integrante{
    private String posicion;
    private String piernaHabil;
    private int cant_goles;

    public Futbolista(String nombre, String apellido, String num_pasaporte, LocalDate fecha_nac, String estado, String posicion, String piernaHabil, int cant_goles){
        super(nombre, apellido, num_pasaporte, fecha_nac, estado);
        this.posicion = posicion;
        this.piernaHabil = piernaHabil;
        this.cant_goles = cant_goles;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getPiernaHabil() {
        return piernaHabil;
    }

    public void setPiernaHabil(String piernaHabil) {
        this.piernaHabil = piernaHabil;
    }

    public int getCant_goles() {
        return cant_goles;
    }

    public void setCant_goles(int cant_goles) {
        this.cant_goles = cant_goles;
    }

    
}
