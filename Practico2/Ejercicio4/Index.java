package Practico2.Ejercicio4;

import java.time.LocalDate;
import java.time.LocalTime;

public class Index {
    public static void main(String[] args) {
        ClubDeportivo edlp = new ClubDeportivo();

        Cancha cancha1 = new Cancha(1, "Futbol 5", 400, "Futbol");
        Cancha cancha2 = new Cancha(2, "Futbol 5", 400, "Futbol");
        Cancha cancha3 = new Cancha(3, "Single", 100, "Padel");
        Cancha cancha4 = new Cancha(4, "Single", 100, "Padel");
        Cancha cancha5 = new Cancha(5, "Dobles", 100, "Padel");
        Cancha cancha6 = new Cancha(6, "Dobles", 100, "Padel");

        Usuario user1 = new Usuario("Fiorella");
        Usuario user2 = new Usuario("Mateo");
        Usuario user3 = new Usuario("Luis");

        System.out.println(edlp);
        System.out.println(cancha1);
        System.out.println(cancha2);
        System.out.println(cancha3);
        System.out.println(cancha3);
        System.out.println(cancha4);
        System.out.println(cancha5);
        System.out.println(cancha6);
        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);

        Turno turno1 =  new Turno(1, LocalDate.of(2025, 2, 20), LocalTime.of(5, 30, 0), user3, cancha6);
        edlp.addTurno(turno1);
        edlp.addSocio(user3);
        edlp.addSocio(user3);

        System.out.println(edlp);
        System.out.println(cancha1);
        System.out.println(cancha2);
        System.out.println(cancha3);
        System.out.println(cancha3);
        System.out.println(cancha4);
        System.out.println(cancha5);
        System.out.println(cancha6);
        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);
    }
}
