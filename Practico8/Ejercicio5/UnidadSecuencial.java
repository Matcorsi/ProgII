package Practico8.Ejercicio5;

import java.util.ArrayList;

public class UnidadSecuencial extends Unidad {

    public UnidadSecuencial(String nombre) {
        super(nombre);
    }

    @Override
    public double getPuntaje() {
        double total = 0;
        for (Evaluable e : partes) {
            total += e.getPuntaje();
        }
        return total;
    }

    @Override
    public double getTiempo() {
        double total = 0;
        for (Evaluable e : partes) {
            total += e.getTiempo();
        }
        return total;
    }

    @Override
    public ArrayList<String> getConceptos() {
        return unionConceptos();
    }
}
