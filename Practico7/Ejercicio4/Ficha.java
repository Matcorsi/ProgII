package Practico7.Ejercicio4;

public class Ficha {
    private int fortaleza;
    private int espacio;
    private int destruccion;

    public Ficha(int fortaleza, int espacio, int destruccion){
        this.fortaleza = fortaleza;
        this.espacio = espacio;
        this.destruccion = destruccion;
    }

    public int getFortaleza() {
        return fortaleza;
    }

    public void setFortaleza(int fortaleza) {
        this.fortaleza = fortaleza;
    }

    public int getEspacio() {
        return espacio;
    }

    public void setEspacio(int espacio) {
        this.espacio = espacio;
    }

    public int getDestruccion() {
        return destruccion;
    }

    public void setDestruccion(int destruccion) {
        this.destruccion = destruccion;
    }

    
}
