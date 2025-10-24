package Practico8.Ejercicio3;

import java.util.ArrayList;

public class Tripulacion extends Miembro{
    private ArrayList<Miembro> miembros;

    public Tripulacion(String nombre){
        super(nombre);
        this.miembros = new ArrayList<>();
    }

    public void addMiembro(Miembro miembro){
        if(!miembros.contains(miembro)){
            miembros.add(miembro);
        }
    }

    @Override
    public int getFuerza(){
        int fuerzaTotal = 0;
        for(Miembro miem : miembros){
            fuerzaTotal += miem.getFuerza();
        }
        return fuerzaTotal;
    }

    @Override
    public double getPeso(){
        if (miembros.isEmpty()) {
            return 0;
        }
        return miembros.get(0).getPeso();
    }

    @Override
    public int getEdad(){
        int edadMayor = 0;
        for(Miembro miem : miembros){
            int edadMiembro = miem.getEdad();
            if(edadMiembro > edadMayor){
                edadMayor = edadMiembro;
            }
        }
        return edadMayor;
    }

    @Override
    public int cantidadPersonajes(){
        int total = 0;
        for(Miembro miem : miembros){
            total += miem.cantidadPersonajes();
        }
        return total;
    }



    
}
