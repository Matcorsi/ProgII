package Practico5.Ejercicio1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Planta p1 = new Planta("Rosa rubiginosa", "Rosa Mosqueta", "Chile", LocalDate.of(2023, 5, 14));
        Planta p2 = new Planta("Lavandula angustifolia", "Lavanda", "Francia", LocalDate.of(2024, 3, 20));
        Planta p3 = new Planta("Aloe vera", "Aloe", "Sudáfrica", LocalDate.now());

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}
