package RecuperatorioTresArroyos;

public class CondicionPrecio implements Condicion{
    private double precio;

    public CondicionPrecio(double precio){
        this.precio = precio;
    }

    @Override
    public boolean cumple(Paquete elem){
        return elem.getPrecio() < precio;
    }
}
