package Practico4.Ejercicio5;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        
        // === PRODUCTOS FRESCOS ===
        Fresco huevoBlanco = new Fresco(
                LocalDate.of(2025, 11, 10), 101,
                LocalDate.of(2025, 10, 1),
                "Granja San Miguel");

        Fresco huevoCodorniz = new Fresco(
                LocalDate.of(2025, 11, 20), 102,
                LocalDate.of(2025, 10, 3),
                "Granja La Esperanza");

        // === PRODUCTOS REFRIGERADOS ===
        Refrigerado polloFresco = new Refrigerado(
                LocalDate.of(2025, 12, 15), 201,
                LocalDate.of(2025, 10, 5),
                "Granja El Trébol",
                "SA-122", 4.0);

        Refrigerado milanesaPollo = new Refrigerado(
                LocalDate.of(2025, 12, 25), 202,
                LocalDate.of(2025, 10, 6),
                "Granja Los Álamos",
                "SA-130", 5.0);

        // === PRODUCTOS CONGELADOS POR AIRE ===
        CongeladoAire papasFritas = new CongeladoAire(
                LocalDate.of(2026, 2, 1), 301,
                LocalDate.of(2025, 10, 2),
                "Granja Norte",
                "CA-400", -20.0,
                78.0, 21.0, 0.03, 0.0, 0.97);

        CongeladoAire hamburguesas = new CongeladoAire(
                LocalDate.of(2026, 3, 1), 302,
                LocalDate.of(2025, 10, 4),
                "Granja Sur",
                "CA-401", -18.0,
                80.0, 19.0, 0.03, 0.0, 0.97);

        // === PRODUCTOS CONGELADOS POR AGUA ===
        CongeladoAgua arvejas = new CongeladoAgua(
                LocalDate.of(2026, 1, 10), 401,
                LocalDate.of(2025, 9, 30),
                "Granja Verde",
                "CW-210", -22.0,
                50, 0.35);

        CongeladoAgua choclo = new CongeladoAgua(
                LocalDate.of(2026, 1, 25), 402,
                LocalDate.of(2025, 9, 28),
                "Granja Dorada",
                "CW-211", -20.0,
                60, 0.40);

        // === PRODUCTOS CONGELADOS POR NITRÓGENO ===
        CongeladoNitrogeno polloRebozado = new CongeladoNitrogeno(
                LocalDate.of(2026, 5, 1), 501,
                LocalDate.of(2025, 10, 1),
                "Granja El Sol",
                "CN-500", -30.0,
                "Inmersión directa", 120);

        CongeladoNitrogeno nuggets = new CongeladoNitrogeno(
                LocalDate.of(2026, 6, 1), 502,
                LocalDate.of(2025, 10, 2),
                "Granja El Sol",
                "CN-501", -32.0,
                "Flujo continuo", 90);


        // === IMPRESIÓN DE ETIQUETAS ===
        System.out.println("===== PRODUCTOS FRESCOS =====");
        huevoBlanco.imprimirEtiqueta();
        huevoCodorniz.imprimirEtiqueta();

        System.out.println("\n===== PRODUCTOS REFRIGERADOS =====");
        polloFresco.imprimirEtiqueta();
        milanesaPollo.imprimirEtiqueta();

        System.out.println("\n===== PRODUCTOS CONGELADOS POR AIRE =====");
        papasFritas.imprimirEtiqueta();
        hamburguesas.imprimirEtiqueta();

        System.out.println("\n===== PRODUCTOS CONGELADOS POR AGUA =====");
        arvejas.imprimirEtiqueta();
        choclo.imprimirEtiqueta();

        System.out.println("\n===== PRODUCTOS CONGELADOS POR NITRÓGENO =====");
        polloRebozado.imprimirEtiqueta();
        nuggets.imprimirEtiqueta();
    }
}
