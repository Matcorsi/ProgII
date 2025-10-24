package Practico8.Ejercicio3;

public class Personaje extends Miembro{
    private int edad;
    private double peso;
    private int fuerza;
    private Fruta fruta;
    
    public Personaje(String nombre, int edad, double peso){
        super(nombre);
        this.edad = edad;
        this.peso = peso;
        this.fuerza = 125;
        this.fruta = null;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getFuerza() {
        return fuerza;
    }

    public Fruta getFruta() {
        return fruta;
    }

    public void comerFruta(Comer fruta) {
        this.fuerza = fruta.getValorFuerza(this);
    }

    @Override
    public int cantidadPersonajes(){
        return 1;
    }


}
