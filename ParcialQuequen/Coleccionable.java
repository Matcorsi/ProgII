package ParcialQuequen;

import java.util.ArrayList;

public class Coleccionable extends Producto{
    private static double costoUnidad;
    private static double precioGramo;
    private double peso;
    private double volumen;
    private ArrayList<String> caracteristicas;

    public Coleccionable(String nombre, double peso, double volumen){
        super(nombre);
        this.peso = peso;
        this.volumen = volumen;
        this.caracteristicas = new ArrayList<>();
    } 

    public static void setCostoUnidad(double costo){
        Coleccionable.costoUnidad = costo;
    }

    public static void setPrecioGramo(double precioGramo){
        Coleccionable.precioGramo = precioGramo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    public void addCaracteristica(String caracteristica) {
        if(!caracteristicas.contains(caracteristica)){
            caracteristicas.add(caracteristica);
        }
    }

    @Override
    public double getCosto(){
        return costoUnidad + peso*precioGramo;
    }

    @Override
    public int getCantidad(){
        return 1;
    }

    @Override
    public ArrayList<String> getCaracteristicas(){
        return new ArrayList<>(caracteristicas);
    }

    @Override
    public ArrayList<Coleccionable> buscar(Filtro filtro){
        ArrayList<Coleccionable> retorno = new ArrayList<>();
        if(filtro.cumple(this)){
            retorno.add(this);
        }
        return retorno;
    }


}
