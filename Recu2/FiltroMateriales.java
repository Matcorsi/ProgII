package Recu2;

public class FiltroMateriales extends Filtro{
    private String material;

    public FiltroMateriales(String material){
        this.material = material;
    }

    @Override
    public boolean cumple(Trabajo trabajo){
        return trabajo.getMateriales().contains(material);
    }
}
