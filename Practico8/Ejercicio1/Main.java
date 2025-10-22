package Practico8.Ejercicio1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Archivo a1 = new Archivo("foto.png", LocalDate.of(2024, 1, 1), 2);
        Archivo a2 = new Archivo("documento.txt", LocalDate.of(2024, 2, 1), 1);
        Link l1 = new Link("acceso_directo", LocalDate.of(2024, 3, 1));
        
        Directorio d1 = new Directorio("Mis Documentos", LocalDate.of(2024, 4, 1));
        d1.addElementoSA(a1);
        d1.addElementoSA(a2);
        d1.addElementoSA(l1);

        Comprimido zip = new Comprimido("backup.zip", LocalDate.of(2024, 5, 1), 2);
        zip.addElementoSA(d1);

        Directorio root = new Directorio("Root", LocalDate.of(2024, 6, 1));
        root.addElementoSA(d1);
        root.addElementoSA(zip);

        System.out.println("Tamaño de Root: " + root.getTamanio() + " KB");
        System.out.println("Cantidad de elementos en Root: " + root.cantElementoSA());
    }
}
