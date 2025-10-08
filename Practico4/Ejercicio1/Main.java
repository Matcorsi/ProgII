package Practico4.Ejercicio1;

public class Main {
    public static void main(String[] args) {
        Alarma alarma = new Alarma();

        System.out.println(alarma.comprobar());

        alarma.setPuerta(true);

        System.out.println(alarma.comprobar());

        Alarma alarmaLuminosa = new AlarmaLuminosa();
        System.out.println(alarmaLuminosa.comprobar());
        alarmaLuminosa.setMovimiento(true);
        System.out.println(alarmaLuminosa.comprobar());

        AlarmaAgua alarmaAgua = new AlarmaAgua();
        System.out.println(alarmaAgua.comprobar());
        alarmaAgua.setMovimiento(true);
        System.out.println(alarmaAgua.comprobar());


    }
}
