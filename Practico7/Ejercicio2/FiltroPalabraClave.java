package Practico7.Ejercicio2;

public class FiltroPalabraClave implements Filtro{

    private String palabraClave;

    public FiltroPalabraClave(String palabra){
        this.palabraClave = palabra;
    }

    public boolean cumple(Documento doc){
        return doc.contienePalabrasClave(palabraClave);
    }
}
