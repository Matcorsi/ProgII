package Practico7.Ejercicio1;

public class CondicionEnfermedad implements Condicion {
    private Enfermedad enfermedad;

    public CondicionEnfermedad(Enfermedad enfermedad) {
        this.enfermedad = enfermedad;
    }

    @Override
    public boolean cumple(Producto producto) {
        return producto.trataEnfermedad(enfermedad);
    }
}
  
