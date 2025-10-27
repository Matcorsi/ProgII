package Recu2;

import java.util.ArrayList;

public class Complejo extends Trabajo{
    private ArrayList<Trabajo> trabajos;

    public Complejo(String nombre){
        super(nombre);
        this.trabajos = new ArrayList<>();
    }

    public ArrayList<Trabajo> getTrabajos(){
        return new ArrayList<>(trabajos);
    }

    public void addTrabajo(Trabajo trabajo){
        trabajos.add(trabajo);
    }

    @Override
    public int cantidadEmpleados(){
        int mayor = 0;
        for(Trabajo tt : trabajos){
            int mayorHijo = tt.cantidadEmpleados();
            if(mayor < mayorHijo){
                mayor = mayorHijo;
            }
        }   
        return mayor;
    }

    @Override
    public ArrayList<String> getMateriales(){
        ArrayList<String> retorno = new ArrayList<>();
        for(Trabajo tt : trabajos){
            ArrayList<String> materialesHijo = tt.getMateriales();
            for(String material : materialesHijo){
                if(!retorno.contains(material)){
                    retorno.add(material);
                }
            }
        }
        return retorno;
    }

    @Override
    public int cantidadDias(){
        int total = 0;
        for(Trabajo tt : trabajos){
            total += tt.cantidadDias();
        }   
        return total;
    }

    @Override
    public ArrayList<Trabajo> buscar(Filtro filtro){
        ArrayList<Trabajo> retorno = new ArrayList<>();
        if(filtro.cumple(this)){
            retorno.add(this);
        } else {
            for(Trabajo tt : trabajos){
                ArrayList<Trabajo> hijo = tt.buscar(filtro);
                retorno.addAll(hijo);
            }
        }
        return retorno;
    }

    @Override
    public double getCosto(Costo costo){
        double costoTotal = 0;
        for(Trabajo tt : trabajos){
            costoTotal += tt.getCosto(costo);
        }
        return costoTotal;
    }

}
