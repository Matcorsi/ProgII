package RecuperatorioTresArroyos;

public class CondCantidadDocentes implements Condicion{
    private int cantidadRequerida;

    public CondCantidadDocentes(int cant){
        this.cantidadRequerida = cant;
    }

    @Override
    public boolean cumple(Paquete elem){
        return elem.getDocentes().size() > cantidadRequerida;
    }
}
