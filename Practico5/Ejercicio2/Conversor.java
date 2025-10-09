package Practico5.Ejercicio2;

public class Conversor {
    public static final double PULGADA = 2.54;
    public static final double LIBRA = 0.453592;
    public static final double GALON = 3.78541;

    public static double centimetrosAPulgadas(double centimetro){
        return centimetro/PULGADA;
    }

    public static double pulgadasACentimetros(double pulgadas){
        return pulgadas*PULGADA;
    }

    public static double librasAKilos(double libras) {
        return libras * LIBRA;
    }

    public static double kilosALibras(double kilos) {
        return kilos / LIBRA;
    }

    public static double galonesALitros(double galones) {
        return galones * GALON;
    }

    public static double litrosAGalones(double litros) {
        return litros / GALON;
    }
}
