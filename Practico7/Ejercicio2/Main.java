package Practico7.Ejercicio2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // ============================
        // CREACIÓN DE DOCUMENTOS
        // ============================
        Documento d1 = new Documento("La Biblioteca de Babel", 
            "Un lugar con infinitos libros, donde cada combinación de letras existe en algún tomo.");
        d1.addAutor("Jorge Luis Borges");
        d1.addPalabraClave("Filosofía");
        d1.addPalabraClave("Ficción");

        Documento d2 = new Documento("Historia de las Guerras", 
            "Relato extenso de los conflictos bélicos más importantes de la historia universal.");
        d2.addAutor("Heródoto");
        d2.addPalabraClave("Historia");
        d2.addPalabraClave("Guerras");

        Documento d3 = new Documento("El Aleph", 
            "En un punto del espacio se encuentra todo el universo visible desde todos los ángulos posibles.");
        d3.addAutor("Jorge Luis Borges");
        d3.addPalabraClave("Filosofía");

        Documento d4 = new Documento("Notas sobre literatura", 
            "Reflexiones breves sobre autores, estilos y corrientes literarias.");
        d4.addAutor("Umberto Eco");

        Documento d5 = new Documento("Cuento breve", "Texto corto sin muchas palabras.");
        d5.addAutor("Anónimo");

        // ============================
        // CREACIÓN DEL HISTORIADOR
        // ============================
        Historiador historiador = new Historiador("Carlos Pérez");
        historiador.addDocumento(d1);
        historiador.addDocumento(d2);
        historiador.addDocumento(d3);
        historiador.addDocumento(d4);
        historiador.addDocumento(d5);

        // ============================
        // FILTROS DE BÚSQUEDA
        // ============================

        // (a) Título exactamente igual
        Filtro f1 = new FiltroTitulo("El Aleph");

        // (b) Título contiene palabra o frase
        Filtro f2 = new FiltroContengaPalabra("Biblioteca");

        // (c) Contiene palabra clave dada
        Filtro f3 = new FiltroPalabraClave("Filosofía");

        // (d) No contiene ninguna palabra clave
        Filtro f4 = new FiltroNot(new FiltroPalabraClave("Ficción")); // o crear FiltroSinPalabrasClave más específico

        // (e) De un autor determinado
        Filtro f5 = new FiltroAutor("Jorge Luis Borges");

        // (f) Contenido contiene palabra o frase
        Filtro f6 = new FiltroContenidoContenga("universo"); // (esta clase te la muestro abajo)

        // (g) Contenido con al menos 20 palabras
        Filtro f7 = new FiltroCantidadPalabras(20);

        // (h) Combinación lógica: autor Borges Y palabra clave Filosofía
        Filtro f8 = new FiltroAnd(f5, f3);

        // ============================
        // PRUEBAS
        // ============================

        mostrarResultados("a) Título exactamente igual a 'El Aleph'", historiador.obtenerDocumento(f1));
        mostrarResultados("b) Título contiene 'Biblioteca'", historiador.obtenerDocumento(f2));
        mostrarResultados("c) Contiene palabra clave 'Filosofía'", historiador.obtenerDocumento(f3));
        mostrarResultados("d) No contiene la palabra clave 'Ficción'", historiador.obtenerDocumento(f4));
        mostrarResultados("e) Autor: Borges", historiador.obtenerDocumento(f5));
        mostrarResultados("f) Contenido contiene 'universo'", historiador.obtenerDocumento(f6));
        mostrarResultados("g) Contenido con al menos 20 palabras", historiador.obtenerDocumento(f7));
        mostrarResultados("h) Autor Borges Y palabra clave Filosofía", historiador.obtenerDocumento(f8));
    }

    private static void mostrarResultados(String titulo, ArrayList<Documento> documentos) {
        System.out.println("\n=== " + titulo + " ===");
        if (documentos.isEmpty()) {
            System.out.println("No se encontraron documentos.");
        } else {
            for (Documento d : documentos) {
                System.out.println("- " + d.getTitulo());
            }
        }
    }
}
