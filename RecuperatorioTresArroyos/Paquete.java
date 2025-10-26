package RecuperatorioTresArroyos;

public abstract class Paquete {
    private static int tope;
    private String nombre;

    public Paquete(String nombre){
        this.nombre = nombre;
    }

    public static void setTope(int valor){
        tope = valor;
    }

    public static int getTope() {
        return tope;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract boolean contienePalabraClave(String palabra);

    public abstract double getPrecio();
    public abstract int cantidad();
    public abstract Paquete cursoMasCaro();

}
