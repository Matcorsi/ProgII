package Practico5.Ejercicio6;

public class Contribuyente {
    private String nombre;
    private String cod_tributario;
    private double monto_fijo;
    private double monto_facturado;

    public Contribuyente(String nombre, String cod_tributario, double monto_fijo, double monto_facturado){
        this.nombre = nombre;
        this.cod_tributario = cod_tributario;
        this.monto_fijo = monto_fijo;
        this.monto_facturado = monto_facturado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCod_tributario() {
        return cod_tributario;
    }

    public void setCod_tributario(String cod_tributario) {
        this.cod_tributario = cod_tributario;
    }

    public double getMonto_fijo() {
        return monto_fijo;
    }

    public void setMonto_fijo(double monto_fijo) {
        this.monto_fijo = monto_fijo;
    }

     public double getMonto_facturado() {
        return monto_facturado;
    }

    public void setMonto_facturado(double monto_facturado) {
        this.monto_facturado = monto_facturado;
    }

    public double totalAbonar(){
        return this.getMonto_fijo();
    }

    public double totalAbonarVentas(){
        return 0;
    }

}
