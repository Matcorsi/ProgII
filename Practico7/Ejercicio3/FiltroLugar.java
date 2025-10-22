package Practico7.Ejercicio3;

public class FiltroLugar implements Filtro{
    private String lugar;

    public FiltroLugar(String lugar){
        this.lugar = lugar;
    }

    public boolean cumple(Planta planta){
        return planta.getLugar().toLowerCase().equals(lugar.toLowerCase());
    }
}
