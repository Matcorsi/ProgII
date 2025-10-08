package Practico4.Ejercicio4;

import java.time.LocalDate;

public class Masajista extends Integrante{
    private String titulo;
    private int anios_experiencia;
    
    public Masajista(String nombre, String apellido, String num_pasaporte, LocalDate fecha_nac, String estado, String titulo, int anios_experiencia){
        super(nombre, apellido, num_pasaporte, fecha_nac, estado);
        this.titulo = titulo;
        this.anios_experiencia = anios_experiencia;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnios_experiencia() {
        return anios_experiencia;
    }

    public void setAnios_experiencia(int anios_experiencia) {
        this.anios_experiencia = anios_experiencia;
    }

    
}
