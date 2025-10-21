package AdicionalFarmacia;

public class CondicionPrecio extends Condicion{
    private double precio;

    public CondicionPrecio(double precio){
        this.precio = precio;
    };

    public boolean cumple(Medicamento med){
        return med.getPrecio() < precio;
    }
}
