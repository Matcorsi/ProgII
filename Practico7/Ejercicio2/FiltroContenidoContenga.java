package Practico7.Ejercicio2;

public class FiltroContenidoContenga implements Filtro {

    private String palabra;

    public FiltroContenidoContenga(String palabra) {
        this.palabra = palabra.toLowerCase();
    }

    @Override
    public boolean cumple(Documento doc) {
        return doc.getContenido().toLowerCase().contains(palabra);
    }
}
