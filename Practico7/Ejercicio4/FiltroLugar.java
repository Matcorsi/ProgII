package Practico7.Ejercicio4;

public class FiltroLugar implements Filtro{
    private int espacio;
    private String operador;

    public FiltroLugar(int espacio, String operador){
        this.espacio = espacio;
        this.operador = operador;
    }

    @Override
    public boolean cumple(Ficha ficha){
        if(operador.equals("<")){   
            return ficha.getEspacio() < espacio;
        } else if(operador.equals(">")){
            return ficha.getEspacio() > espacio;
        } else {
            return ficha.getEspacio() == espacio;
        }
    }
}
