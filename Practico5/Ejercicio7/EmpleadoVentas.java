package Practico5.Ejercicio7;

public class EmpleadoVentas extends Empleado{
    private double porcentajeVentas;
    private double montoVentas;

    public EmpleadoVentas(String nombre, String apellido, String dni, double sueldo, double porcentaje, double montoVentas){
        super(nombre, apellido, dni, sueldo);
        this.porcentajeVentas = porcentaje;
        this.montoVentas = montoVentas;
    }

    public double getPorcentajeVentas() {
        return porcentajeVentas;
    }

    public void setPorcentajeVentas(double porcentajeVentas) {
        this.porcentajeVentas = porcentajeVentas;
    }

    public double getMontoVentas() {
        return montoVentas;
    }

    public void setMontoVentas(double montoVentas) {
        this.montoVentas = montoVentas;
    }

    @Override
    public double getSueldo(){
        return super.getSueldo() + (getMontoVentas()*getPorcentajeVentas()/100);
    }

    

}
