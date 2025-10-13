package Practico6.Ejercicio1;

import java.time.LocalDate;

public class Pelicula extends Item{

    private String genero;
    private LocalDate fecha_estreno;
    private int cantidad_copias;

    public Pelicula(String nombre, String genero, LocalDate fecha_estreno, int cantidad_copias){
        super(nombre);
        this.genero = genero;
        this.fecha_estreno = fecha_estreno;
        this.cantidad_copias = cantidad_copias;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public LocalDate getFecha_estreno() {
        return fecha_estreno;
    }

    public void setFecha_estreno(LocalDate fecha_estreno) {
        this.fecha_estreno = fecha_estreno;
    }

    public int getCantidad_copias() {
        return cantidad_copias;
    }

    public void setCantidad_copias(int cantidad_copias) {
        this.cantidad_copias = cantidad_copias;
    }

    @Override
    public boolean estaDisponible(){
        if(cantidad_copias > 0){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void alquilar(){
        if(estaDisponible()){
            System.out.println("La Pelicula " + this.getNombre() +  ", fue alquilada con exito");
            this.cantidad_copias -= 1;
        }
    }

    
}
