package Practico7.Ejercicio2;

public class FiltroTitulo implements Filtro{
    
    private String tituloBuscado;

    public FiltroTitulo(String tituloBuscado){
        this.tituloBuscado = tituloBuscado;
    }

    public boolean cumple(Documento doc){
        return doc.getTitulo().equals(tituloBuscado);
    }
}
