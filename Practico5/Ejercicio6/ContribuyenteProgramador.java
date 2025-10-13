package Practico5.Ejercicio6;

public class ContribuyenteProgramador extends Contribuyente{

    public ContribuyenteProgramador(String nombre, String cod_tributario, double monto_fijo, double monto_facturado){
        super(nombre, cod_tributario, monto_fijo, monto_facturado);
    }

    @Override
    public double totalAbonarVentas(){
        return this.getMonto_facturado()*2/100;
    }

    @Override
    public double totalAbonar(){
        return (this.getMonto_fijo()*20/100) + this.totalAbonarVentas();
    }

}
