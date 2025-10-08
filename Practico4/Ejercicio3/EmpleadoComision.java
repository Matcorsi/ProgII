package Practico4.Ejercicio3;

public class EmpleadoComision extends Empleado{
    private int cantVentas;
    private double porcentaje;

    public EmpleadoComision(String nombre, String dni, double salario, int cantVentas, double porcentaje){
        super(nombre, dni, salario);
        this.cantVentas = cantVentas;
        this.porcentaje = porcentaje;
    }

    public int getCantVentas() {
        return cantVentas;
    }

    public void setCantVentas(int cantVentas) {
        this.cantVentas = cantVentas;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public double calcularSalario(){
        return this.getSalario() + cantVentas*(porcentaje/100);
    }
}
