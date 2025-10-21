package AdicionalFarmacia;

import java.util.ArrayList;

public class Medicamento {
    private String nombre;
    private String laboratorio;
    private double precio;
    private ArrayList<String> sintomas;

    public Medicamento(String nombre, String laboratorio, double precio){
        this.nombre = nombre;
        this.laboratorio = laboratorio;
        this.precio = precio;
        this.sintomas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public ArrayList<String> getSintomas() {
        return new ArrayList<>(sintomas);
    }

    public void addSintoma(String sintoma) {
        if(!sintomas.contains(sintoma)){
            sintomas.add(sintoma);
        } else {
            System.out.println("El sintoma ya existe");
        }
    }

    @Override
    public String toString() {
        return nombre + " (" + laboratorio + ") - $" + precio;
    }

    

}
