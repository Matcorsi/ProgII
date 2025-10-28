package ParcialQuequen;

import java.util.ArrayList;

public class ColeccionablePromocional extends Coleccionable{
    private double descuento;

    public ColeccionablePromocional(String nombre, double peso, double volumen, double descuento){
        super(nombre, peso, volumen);
        this.descuento = descuento;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    @Override
    public ArrayList<Coleccionable> buscar(Filtro filtro){
        ArrayList<Coleccionable> retorno = new ArrayList<>();
        retorno.add(this);
        return retorno;
    }

    @Override
    public double getCosto(){
        double costo = super.getCosto();
        return costo-costo*descuento;
    }

    
}
