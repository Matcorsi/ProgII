package Practico7.Ejercicio3;

public class FiltroSol implements Filtro{
    private int cant_sol;
    private String operador;

    public FiltroSol(int cant_sol, String operador){
        this.cant_sol = cant_sol;
        this.operador = operador;
    }

    public boolean cumple(Planta planta){
        if(operador.equals("<")){
            return planta.getSol() < cant_sol;
        } else if(operador.equals(">")){
            return planta.getSol() > cant_sol;
        } else {
            return planta.getSol() == cant_sol;
        }
    }
}
