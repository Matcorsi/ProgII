package Practico3.Ejercicio1;

public class Empleado {
    private String nombre;
    private int id_empleado;
    private int cant_encuestas;

    public Empleado(String nombre, int id_empleado){
        this.nombre = nombre;
        this.id_empleado = id_empleado;
        this.cant_encuestas = 0;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setIdEmpleado(int id_empleado){
        this.id_empleado = id_empleado;
    }

    public int getIdEmpleado(){
        return this.id_empleado;
    }

    public void completoEncuesta(){
        this.cant_encuestas += 1;
    }

    public int getEncuestasRealizadas(){
        return this.cant_encuestas;
    }
}
