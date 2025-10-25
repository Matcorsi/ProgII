package Practico8.Ejercicio5;

import java.util.ArrayList;
import java.util.HashSet;

public abstract class Unidad extends Evaluable {
    protected ArrayList<Evaluable> partes;

    public Unidad(String nombre) {
        super(nombre);
        this.partes = new ArrayList<>();
    }

    public void addParte(Evaluable e) {
        if (!partes.contains(e)) {
            partes.add(e);
        }
    }

    protected ArrayList<String> unionConceptos() {
        HashSet<String> set = new HashSet<>();
        for (Evaluable e : partes) {
            set.addAll(e.getConceptos());
        }
        return new ArrayList<>(set);
    }
}
