package Practico5.Ejer5;

import java.util.ArrayList;

public class Lote {

    private String nombre;
    private double superficie;
    private ArrayList<Mineral> minerales;

    public Lote(String nombre, double superficie){
        this.nombre = nombre;
        this.superficie = superficie;
        this.minerales = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public ArrayList<Mineral> getMinerales() {
        return minerales;
    }

    public void addMineral(Mineral mineral) {
        this.minerales.add(mineral);
    }

    public boolean puedeSembrar(Cereal cereal){
        if(cereal.getMinerales().containsAll(minerales)){
            return true;
        } else {
            return false;
        }
    }

}
