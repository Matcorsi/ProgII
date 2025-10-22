package Practico7.Ejercicio2;

import java.util.ArrayList;

public class Documento {
    private String titulo;
    private ArrayList<String> autores;
    private String contenido;
    private ArrayList<String> palabrasClave;

    public Documento(String titulo, String contenido){
        this.titulo = titulo;
        this.contenido = contenido;
        this.autores = new ArrayList<>();
        this.palabrasClave = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean contieneAutor(String autor) {
        return autores.contains(autor);
    }

    public void addAutor(String autor) {
        if(!autores.contains(autor)){
            autores.add(autor);
        } else {
            System.out.println("El autor ya existe!");
        }
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public boolean contienePalabrasClave(String palabra) {
        return palabrasClave.contains(palabra);
    }

    public ArrayList<String> getPalabrasClaves(){
        return new ArrayList<>(palabrasClave);
    }

    public void addPalabraClave(String palabraClave) {
        if(!palabrasClave.contains(palabraClave)){
            palabrasClave.add(palabraClave);
        } else {
            System.out.println("La palabra ya existe");
        }
    }

    

}
