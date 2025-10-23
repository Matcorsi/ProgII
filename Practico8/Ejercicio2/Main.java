package Practico8.Ejercicio2;

public class Main {
    public static void main(String[] args) {
        Paquete p1 = new Paquete("T001", "Buenos Aires", "Calle A 123", "Calle B 456", "Domicilio", 2.5);
        Paquete p2 = new Paquete("T002", "Buenos Aires", "Calle C 789", "Calle D 000", "Sucursal", 1.5);

        System.out.println("Peso paquete1: " + p1.getPeso());
        System.out.println("Codigo paquete1: " + p1.getCodigo_seguimiento());

        System.out.println("Peso paquete2: " + p2.getPeso());
        System.out.println("Codigo paquete2: " + p2.getCodigo_seguimiento());


        ComboPostal combo1 = new ComboPostal("C100", "Buenos Aires", "Sucursal Centro", "Oficina Norte");
        combo1.addPaquete(p1);
        combo1.addPaquete(p2);
        System.out.println("Peso total del combo1: " + combo1.getPeso());
        System.out.println("Codigo combo1: " + combo1.getCodigo_seguimiento());
        System.out.println("Codigo paquete1: " + p1.getCodigo_seguimiento());
        System.out.println("Codigo paquete2: " + p2.getCodigo_seguimiento());


    
        ComboPostal combo2 = new ComboPostal("BB14", "Buenos Aires", "Sucursal Centro", "Oficina Norte");
        combo2.addPaquete(combo1);
        System.out.println("Peso total del combo2: " + combo2.getPeso());
        System.out.println("Codigo combo2: " + combo2.getCodigo_seguimiento());
        System.out.println("Codigo combo1: " + combo1.getCodigo_seguimiento());
        System.out.println("Codigo paquete1: " + p1.getCodigo_seguimiento());
        System.out.println("Codigo paquete2: " + p2.getCodigo_seguimiento());

    
    }
    
}
