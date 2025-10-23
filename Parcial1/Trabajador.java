package Parcial1;

public abstract class Trabajador {
    private String nombre;

    public Trabajador(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract double totalGanancias();
}
