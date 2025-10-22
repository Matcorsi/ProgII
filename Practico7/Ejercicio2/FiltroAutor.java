package Practico7.Ejercicio2;

public class FiltroAutor implements Filtro{

    private String autor;

    public FiltroAutor(String autor){
        this.autor = autor;
    }

    public boolean cumple(Documento doc){
        return doc.contieneAutor(autor);
    }
}
