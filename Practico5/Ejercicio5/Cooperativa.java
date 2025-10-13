package Practico5.Ejercicio5;

import java.util.ArrayList;

public class Cooperativa {
    private String nombre;
    private ArrayList<Mineral> minerales_primarios;
    private ArrayList<Mineral> minerales_secundarios;
    private ArrayList<Lote> lotes;
    private ArrayList<Cereal> cereales;

    public Cooperativa(String nombre){
        this.nombre = nombre;
        this.minerales_primarios = new ArrayList<>();
        this.minerales_secundarios = new ArrayList<>();
        this.lotes = new ArrayList<>();
        this.cereales = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Mineral> getMinerales_primarios() {
        return minerales_primarios;
    }

    public void addMineralPrimario(Mineral mineral) {
        this.minerales_primarios.add(mineral);
    }

    public ArrayList<Mineral> getMinerales_secundarios() {
        return minerales_secundarios;
    }

    public void addMineralSecundario(Mineral mineral) {
        this.minerales_secundarios.add(mineral);
    }

    public ArrayList<Lote> getLotes() {
        return lotes;
    }

    public void addLote(Lote lote) {
        this.lotes.add(lote);
    }

    public ArrayList<Cereal> getCereales() {
        return cereales;
    }

    public void addCereales(Cereal cereal) {
        this.cereales.add(cereal);
    }

    public String tipoDeLote(Lote lote){
        if(lote.getMinerales().containsAll(minerales_primarios)){
            return "Especial";
        } else if(lote.getMinerales().containsAll(minerales_secundarios)){
            return "Comun";
        } else {
            return null;
        }
    }

    public ArrayList<Lote> getLotesPuedenSembrar(Cereal cereal){
        ArrayList<Lote> lotesAptos = new ArrayList<>();
        for(Lote lote : lotes){
            if(lote.puedeSembrar(cereal)){
                lotesAptos.add(lote);
            }
        }
        return lotesAptos;
    }

    public ArrayList<Cereal> getCerealesPuedenSembrar(Lote lote){
        ArrayList<Cereal> cerealesAptos = new ArrayList<>();
        for(Cereal cereal : cereales){
            if(cereal.puedeSembrar(lote)){
                cerealesAptos.add(cereal);
            }
        }
        return cerealesAptos;
    }

    
}
