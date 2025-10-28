package ParcialQuequen;

import java.util.ArrayList;

public class Tematica extends Producto{
    private ArrayList<Producto> productos;
    private Filtro filtro;
    private double extra;

    public Tematica(String nombre, Filtro filtro, double extra){
        super(nombre);
        this.filtro = filtro;
        this.extra = extra;
        this.productos = new ArrayList<>();
    }

    public double getExtra() {
        return extra;
    }

    public void setExtra(double extra) {
        this.extra = extra;
    }

    public void setFiltro(Filtro filtro) {
        this.filtro = filtro;
    }

    public void addProducto(Producto prod){
        if(filtro != null){
            if(filtro.cumple(prod)){
                productos.add(prod);
            }
        } else {
            productos.add(prod);
        }
    }

    @Override
    public double getPeso(){
        double total = 0;
        for(Producto pp : productos){
            total += pp.getPeso();
        }
        return total;
    }

    @Override
    public double getVolumen(){
        double total = 0;
        for(Producto pp : productos){
            total += pp.getVolumen();
        }
        double totalExtra = getCantidad() * getExtra();
        return total + totalExtra;
    }

    @Override
    public int getCantidad(){
        int total = 0;
        for(Producto pp : productos){
            total += pp.getCantidad();
        }
        return total;
    }

    @Override
    public ArrayList<String> getCaracteristicas(){
        ArrayList<String> retorno = new ArrayList<>();
        for(Producto pp : productos){
            ArrayList<String> caracHijo = pp.getCaracteristicas();
            for(String carac : caracHijo){
                if(!retorno.contains(carac)){
                    retorno.add(carac);
                }
            }
        }
        return retorno;
    }

    @Override
    public ArrayList<Coleccionable> buscar(Filtro filtro){
        ArrayList<Coleccionable> retorno = new ArrayList<>();
        for(Producto pp : productos){
            ArrayList<Coleccionable> hijo = pp.buscar(filtro);
            retorno.addAll(hijo);
        }
        return retorno;
    }

    @Override
    public double getCosto(){
        double costoTotal = 0;
        for(Producto pp : productos){
            costoTotal += pp.getCosto();
        }
        return costoTotal;
    }




}
