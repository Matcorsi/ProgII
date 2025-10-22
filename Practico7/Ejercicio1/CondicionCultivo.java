package Practico7.Ejercicio1;

public class CondicionCultivo implements Condicion{
    private Cultivo cultivo;

    public CondicionCultivo(Cultivo cultivo){
        this.cultivo = cultivo;
    }

    public boolean cumple(Producto prod){
        return prod.getPatologiasQueTrata().containsAll(cultivo.getEnfermedadesFrecuentes());
    }
}
