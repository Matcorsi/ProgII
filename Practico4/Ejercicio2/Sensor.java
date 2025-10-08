package Practico4.Ejercicio2;

public class Sensor {
    private String nombre;
    private boolean estado;

    public Sensor(String nombre){
        this.nombre = nombre;
        this.estado = false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }


}
