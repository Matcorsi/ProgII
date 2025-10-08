package Practico4.Ejercicio5;

import java.time.LocalDate;

public class Refrigerado extends Producto{

    private String cod_superAlimentaria;
    private double temperatura;

    public Refrigerado(LocalDate fecha_vencimiento, int numero_lote, LocalDate fecha_envasado, String granja_origen, String cod_superAlimentaria, double temperatura){
        super(fecha_vencimiento, numero_lote, fecha_envasado, granja_origen);
        this.cod_superAlimentaria = cod_superAlimentaria;
        this.temperatura = temperatura;
    }

    public String getCod_superAlimentaria() {
        return cod_superAlimentaria;
    }

    public void setCod_superAlimentaria(String cod_superAlimentaria) {
        this.cod_superAlimentaria = cod_superAlimentaria;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public void imprimirEtiqueta(){
        super.imprimirEtiqueta();
        System.out.println("Codigo de supervisión alimentaria: " + this.getCod_superAlimentaria() +
                        " | temperatura de mantenimiento recomendada: " + this.getTemperatura());
    }
}
