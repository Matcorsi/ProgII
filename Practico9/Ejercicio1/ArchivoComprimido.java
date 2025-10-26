package Practico9.Ejercicio1;

public class ArchivoComprimido extends Directorio{
    private int tasaCompresion;

    public ArchivoComprimido(String nombre, int tasaCompresion){
        super(nombre);
        this.tasaCompresion = tasaCompresion;
    }

    public int getTasaCompresion() {
        return tasaCompresion;
    }

    public void setTasaCompresion(int tasaCompresion) {
        this.tasaCompresion = tasaCompresion;
    }

    @Override
    public double getTamanio(){
        double total = super.getTamanio();
        return total / tasaCompresion;
    }

    
}
