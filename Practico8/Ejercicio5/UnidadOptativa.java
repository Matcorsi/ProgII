package Practico8.Ejercicio5;

import java.util.ArrayList;

public class UnidadOptativa extends Unidad {

    public UnidadOptativa(String nombre) {
        super(nombre);
    }

    @Override
    public double getPuntaje() {
        double max = 0;
        for (Evaluable e : partes) {
            if (e.getPuntaje() > max) {
                max = e.getPuntaje();
            }
        }
        return max;
    }

    @Override
    public double getTiempo() {
        double max = 0;
        for (Evaluable e : partes) {
            if (e.getTiempo() > max) {
                max = e.getTiempo();
            }
        }
        return max;
    }

    @Override
    public ArrayList<String> getConceptos() {
        return unionConceptos();
    }
}
