package Practico2.Ejercicio1;

public class Main {
    public static void main(String[] args) {
        
        Serie matchPoint = new Serie("Match Point", "Pelicula basada en la historia del tenista Juan Martin Del Potro", "Disney+", "Deporte");
        Temporada temp1 = new Temporada(1);
        Temporada temp2 = new Temporada(2);
        Episodio epis1 = new Episodio("Primer saque", "Como comenzo todo, sus inicios en el tenis");
        Episodio epis2 = new Episodio("Segundo saque", "Como comenzo todo, sus inicios en el tenis");
        Episodio epis3 = new Episodio("Tercer saque", "Como comenzo todo, sus inicios en el tenis");
        Episodio epis4 = new Episodio("Tercer saque", "Como comenzo todo, sus inicios en el tenis");
        Episodio epis5 = new Episodio("Tercer saque", "Como comenzo todo, sus inicios en el tenis");


        temp1.addEpisodio(epis1);
        temp1.addEpisodio(epis2);
        temp1.addEpisodio(epis3);
        temp2.addEpisodio(epis4);
        temp2.addEpisodio(epis5);
        epis1.setCalificacion(2);
        epis2.setCalificacion(1);
        epis3.setCalificacion(4);
        epis4.setCalificacion(4);
        epis5.setFueVisto(true);
        epis5.setCalificacion(5);
        matchPoint.addTemporada(temp1);
        matchPoint.addTemporada(temp2);

        System.out.println(temp1.cantidadEpisodiosVistos());
        System.out.println(temp2.cantidadEpisodiosVistos());

        System.out.println(matchPoint.cantEpisodiosVistos());
        System.out.println(temp1.promCalifTemp());
        System.out.println(temp2.promCalifTemp());
        System.out.println(matchPoint.califPromedioSerie());
        System.out.println(matchPoint.fueVistaCompleta());

        
    }
}
