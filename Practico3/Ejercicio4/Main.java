package Practico3.Ejercicio4;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        
        Celular motorola = new Celular("Mateo");
        motorola.getContactos();

        Contacto cont1 = new Contacto("Fiorella", "Goitandia", LocalDate.of(1998,04,18), "2494234530", "Sarmiento 1802", "FioreGoi@gmail.com", "Tandil");
        Contacto cont2 = new Contacto("Mateo", "Corsi", LocalDate.of(1997,07,23), "2494234530", "Libertad 478", "Mateocorsi@gmail.com", "Tandil");
        Contacto cont3 = new Contacto("Fiorella", "Goitandia", LocalDate.of(1998,04,18), "2494234530", "Sarmiento 1802", "FioreGoi@gmail.com", "Tandil");
        Contacto cont4 = new Contacto("Fiorella", "Goitandia", LocalDate.of(1998,04,18), "2494234530", "Sarmiento 1802", "FioreGoi@gmail.com", "Tandil");
        Contacto cont5 = new Contacto("Fiorella", "Goitandia", LocalDate.of(1998,04,18), "2494234530", "Sarmiento 1802", "FioreGoi@gmail.com", "Tandil");

        motorola.addContacto(cont1);
        motorola.addContacto(cont2);
        motorola.addContacto(cont3);
        motorola.addContacto(cont4);
        motorola.addContacto(cont5);

        motorola.getContactos();
        System.out.println(motorola.getContactosNumeroRepetido());
        System.out.println(motorola.promedioEdadContactos());
        System.out.println(motorola.contactosRepetidos());

    }
}
