package Practico7.Ejercicio5;

public class FiltroEstreno implements Filtro{
    private int estreno;
    private String operador;

    public FiltroEstreno(int estreno, String operador){
        this.estreno = estreno;
        this.operador = operador;
    }

    @Override
    public boolean cumple(Pelicula pelicula){
        if(operador.equals("<")){   
            return pelicula.getAnioEstreno() < estreno;
        } else if(operador.equals(">")){
            return pelicula.getAnioEstreno() > estreno;
        } else {
            return pelicula.getAnioEstreno() == estreno;
        }
    }
}
