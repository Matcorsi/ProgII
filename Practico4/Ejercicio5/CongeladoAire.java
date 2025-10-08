package Practico4.Ejercicio5;

import java.time.LocalDate;

public class CongeladoAire extends Refrigerado{

    private double nitrogeno;
    private double oxigeno;
    private double dioxido;
    private double carbono;
    private double vapor;
    
    public CongeladoAire(LocalDate fecha_vencimiento, int numero_lote, LocalDate fecha_envasado, 
                        String granja_origen, String cod_superAlimentaria, double temperatura,
                        double nitrogeno, double oxigeno, double dioxido, double carbono,
                        double vapor){
        super(fecha_vencimiento, numero_lote, fecha_envasado, granja_origen, cod_superAlimentaria, temperatura);
        this.nitrogeno = nitrogeno;
        this.oxigeno = oxigeno;
        this.dioxido = dioxido;
        this.carbono = carbono;
        this.vapor = vapor;
    }

    public double getNitrogeno() {
        return nitrogeno;
    }

    public void setNitrogeno(double nitrogeno) {
        this.nitrogeno = nitrogeno;
    }

    public double getOxigeno() {
        return oxigeno;
    }

    public void setOxigeno(double oxigeno) {
        this.oxigeno = oxigeno;
    }

    public double getDioxido() {
        return dioxido;
    }

    public void setDioxido(double dioxido) {
        this.dioxido = dioxido;
    }

    public double getCarbono() {
        return carbono;
    }

    public void setCarbono(double carbono) {
        this.carbono = carbono;
    }

    public double getVapor() {
        return vapor;
    }

    public void setVapor(double vapor) {
        this.vapor = vapor;
    }

    @Override
    public void imprimirEtiqueta(){
        super.imprimirEtiqueta();
        System.out.println("Nitrogeno: " + this.getNitrogeno() + " %" +
                        " | Oxigeno: " + this.getOxigeno() + " %" +
                        " | Dioxido: " + this.getDioxido() + " %" +
                        " | Carbono: " + this.getCarbono() + " %" +
                        " | Vapor: " + this.getVapor() + " %");
    }

    
}
