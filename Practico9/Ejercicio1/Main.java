package Practico9.Ejercicio1;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        // === Crear archivos simples ===
        Archivo a1 = new Archivo("parcial1.txt", 10);
        Archivo a2 = new Archivo("resumen.docx", 5);
        Archivo a3 = new Archivo("parcial2.txt", 12);
        Archivo a4 = new Archivo("tareas.txt", 8);

        // === Crear directorios ===
        Directorio d1 = new Directorio("Documentos");
        Directorio d2 = new Directorio("Parciales");
        Directorio d3 = new Directorio("Otros");

        // Agregar archivos a los directorios
        d2.addElemento(a1);
        d2.addElemento(a3);

        d3.addElemento(a2);
        d3.addElemento(a4);

        // Agregar subdirectorios
        d1.addElemento(d2);
        d1.addElemento(d3);

        // === Crear un archivo comprimido con tasa de compresión 2 ===
        ArchivoComprimido zip = new ArchivoComprimido("Backup.zip", 2);
        zip.addElemento(d1); // contiene todo Documentos

        // === Crear un link ===
        Link accesoDirecto = new Link("link_a_parcial1", a1);
        d1.addElemento(accesoDirecto);

        // === Mostrar tamaños ===
        System.out.println("Tamaño de 'Parciales': " + d2.getTamanio() + " KB");
        System.out.println("Tamaño de 'Documentos': " + d1.getTamanio() + " KB");
        System.out.println("Tamaño del ZIP: " + zip.getTamanio() + " KB");

        // === Buscar elementos cuyo nombre contenga 'parcial' ===
        Condicion buscarParcial = new CondNombre("parcial");
        ArrayList<ElementoSA> resultados = d1.buscar(buscarParcial);

        System.out.println("\n=== Resultados de búsqueda 'parcial' ===");
        for (ElementoSA e : resultados) {
            System.out.println("- " + e.getNombre());
        }

        // === Buscar en el ZIP también ===
        ArrayList<ElementoSA> resultadosZip = zip.buscar(buscarParcial);
        System.out.println("\n=== Resultados dentro del ZIP ===");
        for (ElementoSA e : resultadosZip) {
            System.out.println("- " + e.getNombre());
        }
    }
}
