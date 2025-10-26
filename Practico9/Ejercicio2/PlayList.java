package Practico9.Ejercicio2;

import java.util.ArrayList;

public class PlayList extends Coleccion{

    public PlayList(String nombre){
        super(nombre);
    }

    @Override
    public ArrayList<Coleccion> buscar(Condicion cond){
        ArrayList<Coleccion> retorno = new ArrayList<>();
        for(Coleccion elem : this.getColeccion()){
            retorno.addAll(elem.buscar(cond));
        }
        return retorno;
    }

}
