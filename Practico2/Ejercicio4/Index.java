package Pract2_Ejer4;

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
    }
}
