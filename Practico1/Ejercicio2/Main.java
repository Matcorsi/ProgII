package Practico1.Ejercicio2;

public class Main {
        public static void main(String[] args) {
            
            Electrodomestico elec1 = new Electrodomestico("Cafetera");
            Electrodomestico elec2 = new Electrodomestico("Cafetera-2", 400, 55,"Amarillo",4);
            
            System.out.println("Electrodomestico: " + elec1.getNombre());
            System.out.println("El balance es: " + elec1.consultarBalance());
            System.out.println("Es bajo consumo: " + elec1.esBajoConsumo());
            System.out.println("Es alta gama: " + elec1.esAltaGama());

            System.out.println("Electrodomestico: " + elec2.getNombre());
            System.out.println("El balance es: " + elec2.consultarBalance());
            System.out.println("Es bajo consumo: " + elec2.esBajoConsumo());
            System.out.println("Es alta gama: " + elec2.esAltaGama());

        }
}
