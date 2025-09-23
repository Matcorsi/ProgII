package Practico3.Ejercicio2;

public class Mueble {
    private String nombre;
    private double peso;
    private double valor_costo;
    private double valor_venta;
    public String madera;
    public String color;

    public Mueble(String nombre, double peso, double valor_costo, double valor_venta, String madera, String color){
        this.nombre = nombre;
        this.peso = peso;
        this.valor_costo = valor_costo;
        this.valor_venta = valor_venta;
        this.madera = madera;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getCosto() {
        return valor_costo;
    }

    public void setCosto(double valor_costo) {
        this.valor_costo = valor_costo;
    }

    public double getValor_venta() {
        return valor_venta;
    }

    public void setValor_venta(double valor_venta) {
        this.valor_venta = valor_venta;
    }

    public String getMadera() {
        return madera;
    }

    public void setMadera(String madera) {
        this.madera = madera;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    

    
}
