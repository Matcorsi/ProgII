package Practico7.Ejercicio1;

import java.util.ArrayList;

public class Producto {
    private String nombre;
    private ArrayList<Cultivo> cuidados;
    private ArrayList<Enfermedad> patologiasQueTrata;

    public Producto(String nombre){
        this.nombre = nombre;
        this.cuidados = new ArrayList<>();
        this.patologiasQueTrata = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Cultivo> getCuidados() {
        return new ArrayList<>(cuidados);
    }

    public void addCuidado(Cultivo cuidado) {
        if(!cuidados.contains(cuidado)){
            cuidados.add(cuidado);
        } else {
            System.out.println("El cuidado: " + cuidado + ", fue agregado antes");
        }
    }

    public ArrayList<Enfermedad> getPatologiasQueTrata() {
        return new ArrayList<>(patologiasQueTrata);
    }

    public void addPatologia(Enfermedad patologia) {
        if(!patologiasQueTrata.contains(patologia)){
            patologiasQueTrata.add(patologia);
        } else {
            System.out.println("La patologia: " + patologia + ", fue agregada antes");
        }
    }

    public boolean seDesaconsejaPara(Cultivo c) {
        return cuidados.contains(c);
    }

    public boolean trataEnfermedad(Enfermedad e) {
        for (String estado : e.getEstados_patologicos()) {
            boolean loTrata = false;
            for (Enfermedad enfProd : patologiasQueTrata) {
                if (enfProd.getEstados_patologicos().contains(estado)) {
                    loTrata = true;
                    break;
                }
            }
            if (!loTrata) return false;
        }
        return true;
    }


}
