package Practico8.Ejercicio3;

public abstract class Miembro {
    private String nombre;

    public Miembro(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract int getFuerza();
    public abstract double getPeso();
    public abstract int getEdad();
    public abstract int cantidadPersonajes();
}
