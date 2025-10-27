package RecuperatorioTresArroyos;

public class CondHoras implements Condicion{
    private int cantHoras;

    public CondHoras(int cantHoras){
        this.cantHoras = cantHoras;
    }

    @Override
    public boolean cumple(Paquete elem){
        return elem.getCantidad_horas() > cantHoras;
    }
}
