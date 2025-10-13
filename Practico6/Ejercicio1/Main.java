package Practico6.Ejercicio1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        // Crear videoclub
        VideoClub club = new VideoClub("Blockbuster Reloaded");

        // Crear clientes
        Cliente juan = new Cliente("Juan Pérez", "12345678");
        Cliente ana = new Cliente("Ana Gómez", "87654321");
        Cliente carlos = new Cliente("Carlos López", "55555555");

        club.addCliente(juan);
        club.addCliente(ana);
        club.addCliente(carlos);

        // Crear películas
        Pelicula matrix = new Pelicula("Matrix", "Ciencia Ficción", LocalDate.of(1999, 3, 31), 2);
        Pelicula toyStory = new Pelicula("Toy Story", "Animación", LocalDate.of(1995, 11, 22), 1);
        Pelicula gladiador = new Pelicula("Gladiador", "Acción", LocalDate.of(2000, 5, 5), 3);

        // Crear vehículos
        Vehiculo electrico = new Vehiculo("Tesla Model 3", "Tesla", 20000, "ABC123", "eléctrico");
        Vehiculo naftero = new Vehiculo("Fiat Cronos", "Fiat", 15000, "XYZ789", "nafta");
        Vehiculo diesel = new Vehiculo("Toyota Hilux", "Toyota", 50000, "DEF456", "diésel");

        // Agregar ítems al videoclub
        club.addItem(matrix);
        club.addItem(toyStory);
        club.addItem(gladiador);
        club.addItem(electrico);
        club.addItem(naftero);
        club.addItem(diesel);

        // ============================
        // Alquilar ítems a clientes
        // ============================

        // Juan alquila Matrix (vigente) y el Tesla (vencido)
        club.alquilarItem(juan, matrix, LocalDate.now().plusDays(3)); // vence en 3 días
        club.alquilarItem(juan, electrico, LocalDate.now().minusDays(1)); // vencido ayer

        // Ana alquila Toy Story (vigente)
        club.alquilarItem(ana, toyStory, LocalDate.now().plusDays(5)); // vigente

        // Carlos alquila Gladiador (vencido)
        club.alquilarItem(carlos, gladiador, LocalDate.now().minusDays(2)); // vencido

        // ============================
        // Mostrar todos los ítems alquilados
        // ============================
        System.out.println("\n📀 Ítems alquilados actualmente:");
        for (Item i : club.itemsAlquilados()) {
            System.out.println("- " + i.getNombre() + " | Vence: " + i.getFecha_vencimiento());
        }

        // ============================
        // Mostrar clientes con alquileres vencidos
        // ============================
        System.out.println("\n⚠️ Clientes con alquileres vencidos:");
        for (Cliente c : club.alquileresVencidos()) {
            System.out.println("- " + c.getNombre());
        }

        // ============================
        // Mostrar disponibilidad de ítems
        // ============================
        System.out.println("\n🚗 Disponibilidad de ítems:");
        for (Item i : club.getItems()) {
            System.out.println(i.getNombre() + " → disponible: " + i.estaDisponible());
        }
    }
}   
