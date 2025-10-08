package Practico4.Ejercicio5;

import java.time.LocalDate;

public class CongeladoAgua extends Refrigerado{

    private double litrosAgua;
    private double salinidad;

    public CongeladoAgua(LocalDate fecha_vencimiento, int numero_lote, LocalDate fecha_envasado, String granja_origen, 
                        String cod_superAlimentaria, double temperatura, double litrosAgua, double salinidad){
        super(fecha_vencimiento, numero_lote, fecha_envasado, granja_origen, cod_superAlimentaria, temperatura);
        this.litrosAgua = litrosAgua;
        this.salinidad = salinidad;
    }

    public double getLitrosAgua() {
        return litrosAgua;
    }

    public void setLitrosAgua(double litrosAgua) {
        this.litrosAgua = litrosAgua;
    }

    public double getSalinidad() {
        return salinidad;
    }

    public void setSalinidad(double salinidad) {
        this.salinidad = salinidad;
    }

    public double salinidadDelAgua(){
        return salinidad*litrosAgua;
    }

    @Override
    public void imprimirEtiqueta(){
        super.imprimirEtiqueta();
        System.out.println("Salinidad del agua: " + this.salinidadDelAgua());
    }
}
