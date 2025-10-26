package Parcial1;

public abstract class Empleado implements Comparable<Empleado>{
    private String nombre; 

    public Empleado(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract double gananciasTotales();

     @Override
    public int compareTo(Empleado otro) {
        // Mayor ganancia primero
        return Double.compare(otro.gananciasTotales(), this.gananciasTotales());
    }
}
