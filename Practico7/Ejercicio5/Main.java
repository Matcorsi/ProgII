package Practico7.Ejercicio5;

public class Main {
    public static void main(String[] args) {
        Plataforma plataforma = new Plataforma();

        // Crear películas
        Pelicula p1 = new Pelicula("La luna roja", "Drama espacial", "Nolan", 2019, 110, 13);
        p1.addGeneros("drama");
        p1.addGeneros("ciencia ficción");
        p1.addActor("Will Smith");

        Pelicula p2 = new Pelicula("Terror en el bosque", "Suspenso rural", "Carpenter", 2014, 90, 16);
        p2.addGeneros("terror");
        p2.addActor("Emma Stone");

        Pelicula p3 = new Pelicula("Pequeños héroes", "Aventura animada", "Pixar", 2022, 95, 7);
        p3.addGeneros("infantil");
        p3.addGeneros("aventura");

        plataforma.addPelicula(p1);
        plataforma.addPelicula(p2);
        plataforma.addPelicula(p3);

        // Buscar películas que contengan "luna" en el título
        Filtro f1 = new FiltroContengaPalabraTitulo("luna");
        System.out.println("Películas con 'luna' en el título:");
        for(Pelicula p : plataforma.buscarPelicula(f1)){
            System.out.println("- " + p.getTitulo());
        }

        // Evaluar rentabilidad
        System.out.println("\nEvaluando rentabilidad (política por defecto):");
        for (Pelicula p : plataforma.getPeliculas()) {
            System.out.println(p.getTitulo() + " → " + (plataforma.esRentable(p) ? "Rentable" : "No rentable"));
        }

        // Cambiar política
        plataforma.setPolitica(new PoliticaExperimental());
        System.out.println("\nEvaluando rentabilidad (política experimental):");
        for (Pelicula p : plataforma.getPeliculas()) {
            System.out.println(p.getTitulo() + " → " + (plataforma.esRentable(p) ? "Rentable" : "No rentable"));
        }
    }
}
