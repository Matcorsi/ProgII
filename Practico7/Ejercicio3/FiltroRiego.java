package Practico7.Ejercicio3;

public class FiltroRiego implements Filtro{ 
    private int cant_riego;
    private String operador;

    public FiltroRiego(int cant_riego, String operador){
        this.cant_riego = cant_riego;
        this.operador = operador;
    }

    public boolean cumple(Planta planta){
        if(operador.equals("<")){
            return planta.getRiego() < cant_riego;
        } else if(operador.equals(">")){
            return planta.getRiego() > cant_riego;
        } else {
            return planta.getRiego() == cant_riego;
        }
    }
}
