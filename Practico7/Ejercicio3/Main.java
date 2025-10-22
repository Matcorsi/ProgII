package Practico7.Ejercicio3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Crear vivero
        Vivero vivero = new Vivero("Vivero Las Flores");

        // Crear plantas
        Planta p1 = new Planta("Epipremnum aureum", "Epipremnum", "Araceae", "Monocotyledoneae", "interior", 4, 3);
        p1.addNombreVulgar("potus");
        p1.addNombreVulgar("pothos");

        Planta p2 = new Planta("Sansevieria trifasciata", "Sansevieria", "Asparagaceae", "Monocotyledoneae", "interior", 8, 2);
        p2.addNombreVulgar("lengua de suegra");

        Planta p3 = new Planta("Crassula ovata", "Crassula", "Crassulaceae", "Dicotyledoneae", "exterior", 9, 4);
        p3.addNombreVulgar("árbol de jade");

        Planta p4 = new Planta("Ficus lyrata", "Ficus", "Moraceae", "Dicotyledoneae", "interior", 5, 6);

        // Agregar al vivero
        vivero.addPlanta(p1);
        vivero.addPlanta(p2);
        vivero.addPlanta(p3);
        vivero.addPlanta(p4);

        // === Filtros ===

        // a) Nombre científico incluye “aureum”
        Filtro f1 = new FiltroNombreCientifico("aureum");

        // b) Nombre vulgar “lengua de suegra”
        Filtro f2 = new FiltroNombreVulgar("lengua de suegra");

        // c) Clasificación “Crassula”
        Filtro f3 = new FiltroClasificacion("Crassula");

        // d) Sol > 5 y Riego < 3
        Filtro f4 = new FiltroAnd(new FiltroSol(5, ">"), new FiltroRiego(3, "<"));

        // e) Sol < 4 y Riego > 4
        Filtro f5 = new FiltroAnd(new FiltroSol(4, "<"), new FiltroRiego(4, ">"));

        // f) Lugar interior y Riego < 3
        Filtro f6 = new FiltroAnd(new FiltroLugar("interior"), new FiltroRiego(3, "<"));

        // g) Cualquier combinación lógica (ej: Crassula o sol > 8)
        Filtro f7 = new FiltroOr(f3, new FiltroSol(8, ">"));

        // === Mostrar resultados ===
        mostrar("a) Nombre científico contiene 'aureum'", vivero.obtenerPlantas(f1));
        mostrar("b) Nombre vulgar 'lengua de suegra'", vivero.obtenerPlantas(f2));
        mostrar("c) Clasificación 'Crassula'", vivero.obtenerPlantas(f3));
        mostrar("d) Sol > 5 y Riego < 3", vivero.obtenerPlantas(f4));
        mostrar("e) Sol < 4 y Riego > 4", vivero.obtenerPlantas(f5));
        mostrar("f) Interior y Riego < 3", vivero.obtenerPlantas(f6));
        mostrar("g) Crassula o Sol > 8", vivero.obtenerPlantas(f7));
    }

    private static void mostrar(String titulo, ArrayList<Planta> plantas) {
        System.out.println("\n=== " + titulo + " ===");
        if (plantas.isEmpty()) {
            System.out.println("No se encontraron plantas.");
        } else {
            for (Planta p : plantas) {
                System.out.println("- " + p.getNombreCientifico());
            }
        }
    }
}
