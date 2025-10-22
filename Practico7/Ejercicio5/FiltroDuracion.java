package Practico7.Ejercicio5;

public class FiltroDuracion implements Filtro{
    private double duracion;
    private String operador;

    public FiltroDuracion(double duracion, String operador){
        this.duracion = duracion;
        this.operador = operador;
    }

    @Override
    public boolean cumple(Pelicula pelicula){
        if(operador.equals("<")){   
            return pelicula.getDuracion() < duracion;
        } else if(operador.equals(">")){
            return pelicula.getDuracion() > duracion;
        } else {
            return pelicula.getDuracion() == duracion;
        }
    }
}
