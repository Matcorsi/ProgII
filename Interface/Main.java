package Interface;

public class Main {
    public static void main(String[] args) {
        GestorDeGuardado gestor = new GestorDeGuardado();

        gestor.agregar(new Archivo("informe"));
        gestor.agregar(new Usuario("Ezequiel"));
        gestor.agregar(new Archivo("foto"));

        gestor.guardarTodo();
    }
}
