package Practico7.Ejercicio3;

import java.util.ArrayList;

public class Planta {
    private String nombreCientifico;
    private ArrayList<String> nombresVulgares;
    private String clasificacionSuperior;
    private String familia;
    private String clase;
    private String lugar;
    private int sol;
    private int riego;

    public Planta(String nombreCientifico, String clasificacionSuperior, String familia, String clase, String lugar, int sol, int riego){
        this.nombreCientifico = nombreCientifico;
        this.clasificacionSuperior = clasificacionSuperior;
        this.familia = familia;
        this.clase = clase;
        this.lugar = lugar;
        this.sol = sol;
        this.riego = riego;
        this.nombresVulgares = new ArrayList<>();
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public String getClasificacionSuperior() {
        return clasificacionSuperior;
    }

    public void setClasificacionSuperior(String clasificacionSuperior) {
        this.clasificacionSuperior = clasificacionSuperior;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public int getSol() {
        return sol;
    }

    public void setSol(int sol) {
        this.sol = sol;
    }

    public int getRiego() {
        return riego;
    }

    public void setRiego(int riego) {
        this.riego = riego;
    }

    public void addNombreVulgar(String nombre){
        if(!nombresVulgares.contains(nombre)){
            nombresVulgares.add(nombre);
        }
    }

    public boolean contieneNombreVulgar(String nombre){
        return nombresVulgares.contains(nombre);
    }
    

    
}
