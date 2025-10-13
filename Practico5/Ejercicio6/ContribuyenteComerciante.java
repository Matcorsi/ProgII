package Practico5.Ejercicio6;

public class ContribuyenteComerciante extends Contribuyente{

    public ContribuyenteComerciante(String nombre, String cod_tributario, double monto_fijo, double monto_facturado){
        super(nombre, cod_tributario, monto_fijo, monto_facturado);
    }

    @Override
    public double totalAbonarVentas(){
        return this.getMonto_facturado()*3.5/100;
    }

    @Override
    public double totalAbonar(){
        return (this.getMonto_fijo()*50/100) + this.totalAbonarVentas();
    }
}
