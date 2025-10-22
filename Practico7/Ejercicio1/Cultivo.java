package Practico7.Ejercicio1;

import java.util.ArrayList;

public class Cultivo {  
    private String nombre;
    private ArrayList<Enfermedad> enfermedadesFrecuentes;

    public Cultivo(String nombre){
        this.nombre = nombre;
        this.enfermedadesFrecuentes = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Enfermedad> getEnfermedadesFrecuentes() {
        return new ArrayList<>(enfermedadesFrecuentes);
    }

    public void addEnfermedadFrecuente(Enfermedad enfermedadFrecuente) {
        if(!enfermedadesFrecuentes.contains(enfermedadFrecuente)){
            enfermedadesFrecuentes.add(enfermedadFrecuente);      
        } else {
            System.out.println("Ya contiene esa enfermedad");
        }
    }

    public boolean puedeUtilizar(Producto producto) {
    if (producto.seDesaconsejaPara(this)) return false;

    for (Enfermedad e : enfermedadesFrecuentes) {
        if (producto.trataEnfermedad(e)) {
            return true;
        }
    }
    return false;
}

    

}
