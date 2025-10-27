package Recu2;

import java.util.ArrayList;

public class Basico extends Trabajo{
    private int cantEmpleados;
    private int cantDias;

    public Basico(String nombre, int cantEmpleados, int cantDias){
        super(nombre);
        this.cantEmpleados = cantEmpleados;
        this.cantDias = cantDias;
    }

    public int cantidadEmpleados() {
        return cantEmpleados;
    }

    public void setCantEmpleados(int cantEmpleados) {
        this.cantEmpleados = cantEmpleados;
    }

    public int cantidadDias() {
        return cantDias;
    }

    public void setCantDias(int cantDias) {
        this.cantDias = cantDias;
    }

    @Override
    public ArrayList<Trabajo> buscar(Filtro filtro){
        ArrayList<Trabajo> retorno = new ArrayList<>();
        if(filtro.cumple(this)){
            retorno.add(this);
        }
        return retorno;
    }

    @Override
    public double getCosto(Costo costo){
        return costo.getCosto(this);
    }
}
