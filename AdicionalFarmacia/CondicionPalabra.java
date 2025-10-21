package AdicionalFarmacia;

public class CondicionPalabra extends Condicion{
    private String palabra;

    public CondicionPalabra(String palabra){
        this.palabra = palabra;
    };

    public boolean cumple(Medicamento med){
        return med.getNombre().contains(palabra);
    }
}
