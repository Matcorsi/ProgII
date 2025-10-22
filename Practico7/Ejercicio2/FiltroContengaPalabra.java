package Practico7.Ejercicio2;

public class FiltroContengaPalabra implements Filtro{

    private String palabra;

    public FiltroContengaPalabra(String palabra){
        this.palabra = palabra;
    }

    public boolean cumple(Documento doc){
        return doc.getTitulo().contains(palabra);
    }
}
