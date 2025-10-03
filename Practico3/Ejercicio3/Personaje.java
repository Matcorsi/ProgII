package Practico3.Ejercicio3;

public class Personaje {
    private String nombreReal;
    private String nombreSuperHeroe;
    private int vision_nocturna;
    private int velocidad;
    private int fuerza;
    private double peso;
    private double altura;
    private int edad;

    public Personaje(String nombreReal, String nombreSuperHeroe, 
    int vision_nocturna, int velocidad, int fuerza, double peso, double altura,
    int edad){
        this.nombreReal = nombreReal;
        this.nombreSuperHeroe = nombreSuperHeroe;
        this.vision_nocturna = vision_nocturna;
        this.velocidad = velocidad;
        this.fuerza = fuerza;
        this.peso = peso;
        this.altura = altura;
        this.edad = edad;
    }

    public String getNombreReal() {
        return nombreReal;
    }

    public void setNombreReal(String nombreReal) {
        this.nombreReal = nombreReal;
    }

    public String getNombreSuperHeroe() {
        return nombreSuperHeroe;
    }

    public void setNombreSuperHeroe(String nombreSuperHeroe) {
        this.nombreSuperHeroe = nombreSuperHeroe;
    }

    public int getVision_nocturna() {
        return vision_nocturna;
    }

    public void setVision_nocturna(int vision_nocturna) {
        this.vision_nocturna = vision_nocturna;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    
}
