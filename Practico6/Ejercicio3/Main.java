package Practico6.Ejercicio3;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Crear puerto
        Puerto puerto = new Puerto("Puerto Cereales");

        // Crear barcos
        Barco barco1 = new Barco("Santa Maria", 5000);
        Barco barco2 = new Barco("Pinta", 3000);
        Barco barco3 = new Barco("Niña", 4000);

        // Agregar barcos al puerto
        puerto.addBarco(barco1);
        puerto.addBarco(barco2);
        puerto.addBarco(barco3);

        puerto.mostrarColas();

        Barco barco4 = new Barco("La caldera", 6000);
        Barco barco5 = new Barco("Jualey", 3400);

        puerto.addBarco(barco4);
        puerto.addBarco(barco5);

        puerto.mostrarColas();

        // Crear camiones
        Camion camion1 = new Camion("ABC123", LocalDate.of(2025, 10, 10));
        Camion camion2 = new Camion("DEF456", LocalDate.of(2025, 10, 12));
        Camion camion3 = new Camion("GHI789", LocalDate.of(2025, 10, 11));

        // Agregar camiones
        System.out.println("\nAgregando camiones...");
        puerto.addCamion(camion1);
        puerto.addCamion(camion2);
        puerto.addCamion(camion3);

        // Mostrar colas después de agregar camiones
        System.out.println("\nEstado de las colas después de agregar camiones:");
        puerto.mostrarColas();

        Camion camion4 = new Camion("GDI789", LocalDate.of(2025, 10, 11));
        Camion camion5 = new Camion("GHT489", LocalDate.of(2025, 2, 25));
        Camion camion6 = new Camion("GAS289", LocalDate.of(2025, 8, 15));
        Camion camion7 = new Camion("RGI799", LocalDate.of(2025, 11, 8));

        puerto.addCamion(camion4);
        puerto.addCamion(camion5);
        puerto.addCamion(camion6);
        puerto.addCamion(camion7);

        // Estado final de las colas
        System.out.println("\nEstado final de las colas:");
        puerto.mostrarColas();
    }
}   
