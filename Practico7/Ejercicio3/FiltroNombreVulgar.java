package Practico7.Ejercicio3;

public class FiltroNombreVulgar implements Filtro{
    private String nombreVulgar;

    public FiltroNombreVulgar(String nombre){
        this.nombreVulgar = nombre;
    }

    public boolean cumple(Planta planta){
        return planta.contieneNombreVulgar(nombreVulgar);
    }

}
