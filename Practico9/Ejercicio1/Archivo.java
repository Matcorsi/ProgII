package Practico9.Ejercicio1;

public class Archivo extends ElementoSA{
    private double tamanio;

    public Archivo(String nombre, double tamanio){
        super(nombre);
        this.tamanio = tamanio;
    }

    public double getTamanio() {
        return tamanio;
    }

    public void setTamanio(double tamanio) {
        setFechaModificacion();
        this.tamanio = tamanio;
    }


}
