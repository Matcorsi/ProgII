package Practico9.Ejercicio1;

import java.util.ArrayList;

public class Directorio extends ElementoSA{
    private ArrayList<ElementoSA> elementos;

    public Directorio(String nombre){
        super(nombre);
        this.elementos = new ArrayList<>();
    }

    public void addElemento(ElementoSA elem){
        if(!elementos.contains(elem)){
            elementos.add(elem);
        }
    }

    @Override
    public double getTamanio(){
        double total = 0;
        for(ElementoSA ee : elementos){
            total += ee.getTamanio();
        }
        return total;
    }

    @Override
    public ArrayList<ElementoSA> buscar(Condicion cond){
        ArrayList<ElementoSA> retorno = new ArrayList<>();
        for(ElementoSA elem : elementos){
            retorno.addAll(elem.buscar(cond));
        }
        return retorno;
    }


}
