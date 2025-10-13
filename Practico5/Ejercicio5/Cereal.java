package Practico5.Ejercicio5;

import java.util.ArrayList;

public class Cereal {

    private String nombre;
    private ArrayList<Mineral> minerales;

    public Cereal(String nombre){
        this.nombre = nombre;
        this.minerales = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Mineral> getMinerales() {
        return minerales;
    }

    public void addMineral(Mineral mineral) {
        this.minerales.add(mineral);
    }

    public boolean puedeSembrar(Lote lote){
        if(lote.getMinerales().containsAll(minerales)){
            return true;
        } else {
            return false;
        }
    }
}
