package Practico2.Ejercicio4;

public class Cancha {
    private int precio;
    private int num_cancha;
    private String descripcion;
    private String deporte;

    public Cancha(int num_cancha, String descripcion ,int precio, String deporte){
        this.num_cancha = num_cancha;
        this.descripcion = descripcion;
        this.precio = precio;
        this.deporte = deporte;
    }

    public void setNumCancha(int num_cancha){
        this.num_cancha = num_cancha;
    }

    public int getNumCancha(){
        return this.num_cancha;
    }

    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }

    public String getDescripcion(){
        return this.descripcion;
    }

    public void setPrecio(int precio){
        this.precio = precio;
    }

    public int getPrecio(){
        return this.precio;
    }

    public String getDeporte(){
        return this.deporte;
    }

    public void setDeporte(String deporte){
        this.deporte = deporte;
    }

    public String toString(){
        return "Numero cancha: " + this.num_cancha + " | Deporte: " + this.deporte  + " | Precio: " + this.precio  + " | Descripcion: " + this.descripcion;
    }

}
