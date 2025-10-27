package RecuperatorioTresArroyos;

import java.util.ArrayList;

public abstract class Paquete {
    private String nombre;

    public Paquete(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract double getPrecio();
    public abstract int getCantidad_horas();
    public abstract ArrayList<String> getDocentes();
    public abstract ArrayList<String> getPalabrasClave();
    public abstract int cantidad();
    public abstract Curso cursoMasCaro();
    public abstract ArrayList<Curso> buscar(Condicion cond);

    public abstract Paquete getCopia();

}
