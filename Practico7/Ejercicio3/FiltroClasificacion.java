package Practico7.Ejercicio3;

public class FiltroClasificacion implements Filtro{
    private String clasificacion;

    public FiltroClasificacion(String clasificacion){
        this.clasificacion = clasificacion;
    }

    public boolean cumple(Planta planta){
        return planta.getClasificacionSuperior().toLowerCase().equals(clasificacion.toLowerCase());
    }
}
