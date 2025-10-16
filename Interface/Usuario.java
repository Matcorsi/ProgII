package Interface;

public class Usuario implements Guardable{
    private String nombre;

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void guardar() {
        System.out.println("Guardando usuario: " + nombre + " en base de datos");
    }
}
