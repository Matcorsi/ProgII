package Practico7.Ejercicio4;

public class FiltroFortaleza implements Filtro{
    private int fortaleza;
    private String operador;

    public FiltroFortaleza(int fortaleza, String operador){
        this.fortaleza = fortaleza;
        this.operador = operador;
    }

    @Override
    public boolean cumple(Ficha ficha){
        if(operador.equals("<")){   
            return ficha.getFortaleza() < fortaleza;
        } else if(operador.equals(">")){
            return ficha.getFortaleza() > fortaleza;
        } else {
            return ficha.getFortaleza() == fortaleza;
        }
    }
}
