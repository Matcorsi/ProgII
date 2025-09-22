package Practico1.Ejercicio2;

public class Electrodomestico {
    private String nombre;
    private double precioBase = 100;
    private String color = "Gris Plata";
    private double consumo = 10;
    private double peso = 2;

    public Electrodomestico(String nombre, double precioBase, double consumo, String color, double peso){
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.consumo = consumo;
        this.color = color;
        this.peso = peso;
    }
    
    public Electrodomestico(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getColor(){
        return this.color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public double getConsumo(){
        return this.consumo;
    }

    public void setConsumo(double consumo){
        this.consumo = consumo;
    }

    public double getPrecioBase(){
        return this.precioBase;
    }

    public void setPrecioBase(double precioBase){
        this.precioBase = precioBase;
    }

     public double getPeso(){
        return this.peso;
    }

    public void setPeso(double peso){
        this.peso = peso;
    }

    public boolean esBajoConsumo(){
       return this.consumo < 45;
    }

    public double consultarBalance(){
        return this.precioBase/this.peso;
    }

    public boolean esAltaGama(){
        return this.consultarBalance() > 3;
    }
}
