package Practico8.Ejercicio3;

public class Fruta implements Comer{
    private String nombre;
    private int valor;

    public Fruta(String nombre, int valor){
        this.nombre = nombre;
        this.valor = valor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getValor(){
        return valor;
    }

    public int getValorFuerza(Personaje personaje){
        return personaje.getFuerza() + this.valor;
    }

    
}
