package Practico3.Ejercicio2;

public class Main {
    public static void main(String[] args) {
        Muebleria pinotea = new Muebleria();

        Mueble silla = new Mueble("Silla", 5.85, 50, 40, "Pino", "Caoba");
        Mueble mesa = new Mueble("Mesa", 8.40, 80, 70, "Algarrobo", "Natural");
        Mueble banco = new Mueble("Banco", 10.00, 150, 100, "Pitiribi", "Marron");

        pinotea.addMueble(banco);
        pinotea.addMueble(mesa);
        pinotea.addMueble(silla); 

        System.out.println(pinotea.precioVenta(banco));
        pinotea.listaValoresMuebles();
    }
}
