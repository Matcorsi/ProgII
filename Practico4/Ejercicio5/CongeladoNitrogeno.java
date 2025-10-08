package Practico4.Ejercicio5;

import java.time.LocalDate;

public class CongeladoNitrogeno  extends Refrigerado{

    private String metodoEmpleado;
    private double tiempoExposicion;

    public CongeladoNitrogeno(LocalDate fecha_vencimiento, int numero_lote, LocalDate fecha_envasado, 
                            String granja_origen, String cod_superAlimentaria, double temperatura,
                            String metodoEmpleado, double tiempoExposicion){
        super(fecha_vencimiento, numero_lote, fecha_envasado, granja_origen, cod_superAlimentaria, temperatura);
        this.metodoEmpleado = metodoEmpleado;
        this.tiempoExposicion = tiempoExposicion;
    }

    public String getMetodoEmpleado() {
        return metodoEmpleado;
    }

    public void setMetodoEmpleado(String metodoEmpleado) {
        this.metodoEmpleado = metodoEmpleado;
    }

    public double getTiempoExposicion() {
        return tiempoExposicion;
    }

    public void setTiempoExposicion(double tiempoExposicion) {
        this.tiempoExposicion = tiempoExposicion;
    }

    @Override
    public void imprimirEtiqueta(){
        super.imprimirEtiqueta();
        System.out.println("Metodo empleado: " + this.getMetodoEmpleado() +
                        " | Tiempo de exposicion al nitrogeno: " + this.getTiempoExposicion());
    }
}
