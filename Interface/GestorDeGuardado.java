package Interface;

import java.util.ArrayList;

public class GestorDeGuardado {
    private ArrayList<Guardable> elementos = new ArrayList<>();

    public void agregar(Guardable g) {
        elementos.add(g);
    }

    public void guardarTodo() {
        for (Guardable g : elementos) {
            g.guardar(); // Polimorfismo en acción
        }
    }
}
