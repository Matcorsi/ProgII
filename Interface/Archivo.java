package Interface;

public class Archivo implements Guardable{
    private String nombre;

    public Archivo(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void guardar() {
        System.out.println("Guardando archivo: " + nombre + ".txt");
    }

}
