package Practico7.Ejercicio2;

public class FiltroCantidadPalabras implements Filtro {

    private int cantPalabrasMinima;

    public FiltroCantidadPalabras(int cantPalabrasMinima) {
        this.cantPalabrasMinima = cantPalabrasMinima;
    }

    @Override
    public boolean cumple(Documento doc) {
        // Obtenemos el contenido
        String contenido = doc.getContenido();

        // Separamos por espacios o saltos de línea (ignorando espacios múltiples)
        String[] palabras = contenido.trim().split("\\s+");

        // Comprobamos si la cantidad es suficiente
        return palabras.length >= cantPalabrasMinima;
    }
}

