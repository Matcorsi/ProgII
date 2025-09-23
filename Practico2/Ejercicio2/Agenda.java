package Pract2_Ejer2;

public class Agenda{
    public static void main(String[] args) {
        Participante part1 = new Participante("Fiorella", "2494534567", "Fiorella18@gmail.com");
        Participante part2 = new Participante("Mateo", "2494537514", "Mateo23@gmail.com");
        Participante part3 = new Participante("Luis", "2494534667", "Luis43@gmail.com");
        Participante part4 = new Participante("Oscar", "2494534223", "Oscar12@gmail.com");

        Reunion reunion1 = new Reunion();
        Reunion reunion2 = new Reunion("Oficina 231", "Desarrollo Web", 1.0);
        Reunion reunion3 = new Reunion("Oficina 14", "Software Libre", 2.0);

        System.out.println(part1);
        part1.setTelefono("2494212121");
        System.out.println(part1);

        reunion1.getParticipantes();
        reunion1.addParticipante(part1);
        reunion1.addParticipante(part2);
        reunion2.addParticipante(part1);
        reunion2.addParticipante(part2);
        reunion2.addParticipante(part3);
        reunion2.addParticipante(part4);


        System.out.println(reunion1);
        reunion1.getParticipantes();
        System.out.println(reunion2);
        reunion2.getParticipantes();
        System.out.println(reunion3);
        reunion3.getParticipantes();



    }
}
