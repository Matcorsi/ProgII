package Practico8.Ejercicio5;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Pregunta p1 = new Pregunta("P1", 5, 10, new ArrayList<>(Arrays.asList("Herencia", "Polimorfismo")));
        Pregunta p2 = new Pregunta("P2", 3, 5, new ArrayList<>(Arrays.asList("Encapsulamiento")));
        Pregunta p3 = new Pregunta("P3", 4, 8, new ArrayList<>(Arrays.asList("Polimorfismo", "Interfaces")));

        UnidadSecuencial unidad1 = new UnidadSecuencial("Unidad 1");
        unidad1.addParte(p1);
        unidad1.addParte(p2);

        UnidadOptativa unidad2 = new UnidadOptativa("Unidad 2");
        unidad2.addParte(p2);
        unidad2.addParte(p3);

        UnidadSecuencial examen = new UnidadSecuencial("Examen Final");
        examen.addParte(unidad1);
        examen.addParte(unidad2);

        System.out.println("Puntaje total: " + examen.getPuntaje());
        System.out.println("Tiempo total: " + examen.getTiempo());
        System.out.println("Conceptos: " + examen.getConceptos());
    }
}
