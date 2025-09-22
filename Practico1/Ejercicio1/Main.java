package Practico1.Ejercicio1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Crear persona con DNI y algunos datos
        Persona p1 = new Persona(12345678, "Juan", "Pérez", LocalDate.of(1995, 9, 2));
        p1.setAltura(1.75);
        p1.setPeso(70);

        System.out.println(p1.infoPersona());
        System.out.println(p1.getAltura());

        p1.estaEnForma();
        p1.esSuCumpleaños();
        p1.esMayorDeEdad();
        p1.puedeVotar();
   
    }


}
