package Practico7.Ejercicio4;

public class FiltroDestruccion implements Filtro{
    private int destruccion;
    private String operador;

    public FiltroDestruccion(int destruccion, String operador){
        this.destruccion = destruccion;
        this.operador = operador;
    }

    @Override
    public boolean cumple(Ficha ficha){
        if(operador.equals("<")){   
            return ficha.getDestruccion() < destruccion;
        } else if(operador.equals(">")){
            return ficha.getDestruccion() > destruccion;
        } else {
            return ficha.getDestruccion() == destruccion;
        }
    }
}
