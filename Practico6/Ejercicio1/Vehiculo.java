package Practico6.Ejercicio1;

public class Vehiculo extends Item{
    private String marca;
    private double kilometros;
    private String patente;
    private String combustible;
    private boolean disponible;

    public Vehiculo(String nombre, String marca, double kilometros, String patente, String combustible){
        super(nombre);
        this.marca = marca;
        this.patente = patente;
        this.kilometros = kilometros;
        this.combustible = combustible;
        this.disponible = true;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getKilometros() {
        return kilometros;
    }

    public void setKilometros(double kilometros) {
        this.kilometros = kilometros;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    @Override
    public boolean estaDisponible(){
        return this.disponible;
    }
    
    @Override
    public void alquilar(){
        this.disponible = false;
    }
    
}
