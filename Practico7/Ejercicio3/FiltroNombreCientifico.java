package Practico7.Ejercicio3;

public class FiltroNombreCientifico implements Filtro{
    private String nombre;

    public FiltroNombreCientifico(String nombre){
        this.nombre = nombre;
    }

    public boolean cumple(Planta planta){
        return planta.getNombreCientifico().contains(nombre);
    }
}   
