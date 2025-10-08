package Practico4.Ejercicio4;

import java.time.LocalDate;

public class Integrante {
    private String nombre;
    private String apellido;
    private String num_pasaporte;
    private LocalDate fecha_nac;
    private String estado;

    public Integrante(String nombre, String apellido, String num_pasaporte, LocalDate fecha_nac, String estado){
        this.nombre = nombre;
        this.apellido = apellido;
        this.num_pasaporte = num_pasaporte;
        this.fecha_nac = fecha_nac;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNum_pasaporte() {
        return num_pasaporte;
    }

    public void setNum_pasaporte(String num_pasaporte) {
        this.num_pasaporte = num_pasaporte;
    }

    public LocalDate getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(LocalDate fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public boolean estaDisponible(){
        return this.getEstado().equals("En país de origen");
    }

    
}
