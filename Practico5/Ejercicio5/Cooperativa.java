package Practico5.Ejercicio5;

import java.util.ArrayList;

public class Cooperativa {
    private String nombre;
    protected ArrayList<String> minerales;
    protected ArrayList<String> minerales_primarios;
    protected ArrayList<String> minerales_secundarios;

    public Cooperativa(String nombre){
        this.nombre = nombre;
        this.minerales = new ArrayList<>();
        this.minerales_primarios = new ArrayList<>();
        this.minerales_secundarios = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getMinerales() {
        return minerales;
    }

    public void addMineral(String mineral) {
        this.minerales.add(mineral);
    }

    public void addMineralPrimario(String mineral) {
        this.minerales_primarios.add(mineral);
    }

    public ArrayList<String> getMineralesPrimarios() {
        return minerales_primarios;
    }

    public void addMineralSecundario(String mineral) {
        this.minerales_secundarios.add(mineral);
    }

    public ArrayList<String> getMineralesSecundarios() {
        return minerales_secundarios;
    }

    public boolean esAptoPara(Cooperativa obj){
        boolean esApto = true;
        for(String min : minerales){
            if(!(obj.getMinerales().contains(min))){
                esApto = false;
            }
        }
        return esApto;
    }
    
}
