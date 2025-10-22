package Practico7.Ejercicio2;

import java.util.ArrayList;

public class Historiador {
    private String nombre;
    private ArrayList<Documento> documentos;

    public Historiador(String nombre){
        this.nombre = nombre;
        this.documentos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void addDocumento(Documento documento) {
        if(!documentos.contains(documento)){
            documentos.add(documento);
        } else {
            System.out.println("El documento ya exite");
        }
    }

    public ArrayList<Documento> obtenerDocumento(Filtro filtro){
        ArrayList<Documento> documentosFitrados = new ArrayList<>();
        for(Documento doc : documentos){
            if(filtro.cumple(doc)){
                documentosFitrados.add(doc);
            }
        }
        return documentosFitrados;
    }

    
}
