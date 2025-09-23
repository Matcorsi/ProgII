package Pract2_Ejer3;

public class index {
    public static void main(String[] args) {

        Pais arg = new Pais("Argentina");

        Provincia ba = new Provincia("Buenos Aires");

        Ciudad tandil = new Ciudad("Tandil", 200000);
        Ciudad rauch = new Ciudad("Rauch", 50000);
        Ciudad gardey = new Ciudad("Gardey", 9000);

        arg.addProvincia(ba);
        ba.addCiudad(tandil);
        ba.addCiudad(rauch);
        ba.addCiudad(gardey);
        tandil.setGastosMantenimiento(2000);
        gardey.setGastosMantenimiento(100);
        


        System.out.println(arg.cantHabitantes());

        System.out.println(ba.masDeLaMitadDeficit());

    }

}
