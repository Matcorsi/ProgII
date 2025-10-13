package Practico5.Ejercicio7;

public class EmpleadoBono extends Empleado{
    private int cant_ventas;
    private int cantParaObtenerBono;
    private double bono;

    public EmpleadoBono(String nombre, String apellido, String dni, double sueldo, int cant_ventas, int cantParaObtenerBono, double bono){
        super(nombre, apellido, dni, sueldo);
        this.cant_ventas = cant_ventas;
        this.cantParaObtenerBono = cantParaObtenerBono;
    }

    public int getCant_ventas() {
        return cant_ventas;
    }

    public void setCant_ventas(int cant_ventas) {
        this.cant_ventas = cant_ventas;
    }

    public int getCantParaObtenerBono() {
        return cantParaObtenerBono;
    }

    public void setCantParaObtenerBono(int cantParaObtenerBono) {
        this.cantParaObtenerBono = cantParaObtenerBono;
    }

    public double getBono() {
        return bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }

    @Override
    public double getSueldo(){
        double sueldoTotal = super.getSueldo();
        if(getCant_ventas() >= getCantParaObtenerBono()){
            sueldoTotal += getBono();
        }
        return sueldoTotal;
    }

    
}
