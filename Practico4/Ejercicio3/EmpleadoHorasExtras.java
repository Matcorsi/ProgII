package Practico4.Ejercicio3;

public class EmpleadoHorasExtras extends Empleado{
    private double horaExtras;
    private double montoExtraXHora;

    public EmpleadoHorasExtras(String nombre, String dni, double salario, double horaExtras, double montoExtraXHora){
        super(nombre,dni,salario);
        this.horaExtras = horaExtras;
        this.montoExtraXHora = montoExtraXHora;
    }

    public double getHoraExtras() {
        return horaExtras;
    }

    public void setHoraExtras(double horaExtras) {
        this.horaExtras = horaExtras;
    }

    public double getMontoExtraXHora() {
        return montoExtraXHora;
    }

    public void setMontoExtraXHora(double montoExtraXHora) {
        this.montoExtraXHora = montoExtraXHora;
    }

    @Override
    public double calcularSalario(){
        return this.getSalario() + montoExtraXHora*horaExtras;
    }

    

}
