package RecuperatorioTresArroyos;

public class CondPrecio implements Condicion{
    private double precio;

    public CondPrecio(double precio){
        this.precio = precio;
    }

    @Override
    public boolean cumple(Paquete elem){
        return elem.getPrecio() < precio;
    }
}
