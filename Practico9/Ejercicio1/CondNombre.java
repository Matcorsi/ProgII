package Practico9.Ejercicio1;

public class CondNombre implements Condicion{
    private String palabra;

    public CondNombre(String palabra){
        this.palabra = palabra;
    }

    @Override
    public boolean cumple(ElementoSA elem){
        return elem.getNombre().contains(palabra);
    }
}
