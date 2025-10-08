package Practico4.Ejercicio4;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Administracion admin = new Administracion();

        Futbolista f1 = new Futbolista(
            "Lionel", "Messi", "ARG001",
            LocalDate.of(1987, 6, 24),
            "En país de origen",
            "Delantero", "Izquierdo", 850
        );

        Futbolista f2 = new Futbolista(
            "Ángel", "Di María", "ARG002",
            LocalDate.of(1988, 2, 14),
            "En concentración",
            "Extremo", "Izquierdo", 200
        );

        Entrenador e1 = new Entrenador(
            "Lionel", "Scaloni", "ARG100",
            LocalDate.of(1978, 5, 16),
            "Viajando",
            "AFA123"
        );

        Masajista m1 = new Masajista(
            "Juan", "Pérez", "ARG200",
            LocalDate.of(1980, 10, 5),
            "En país de origen",
            "Kinesiólogo", 12
        );

        // Agregar todos a la delegación
        admin.addIntegrante(f1);
        admin.addIntegrante(f2);
        admin.addIntegrante(e1);
        admin.addIntegrante(m1);

        // Mostrar los disponibles
        System.out.println("=== Integrantes disponibles para evento solidario ===");
        for (Integrante integrante : admin.disponibilidad()) {
            System.out.println(integrante.getNombre() + " " + integrante.getApellido() +
                               " - Estado: " + integrante.getEstado());
        }
    }
}
