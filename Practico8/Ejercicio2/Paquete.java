package Practico8.Ejercicio2;

public class Paquete extends ElementoPostal{
    private String retiro;
    private double peso;

    public Paquete(String codigo, String ciudad_destino, String direc_destinatario, String direc_remitente, String retiro, double peso){
        super(codigo, ciudad_destino, direc_destinatario, direc_remitente);
        this.retiro = retiro;
        this.peso = peso;
    }

    public String getRetiro() {
        return retiro;
    }

    public void setRetiro(String retiro) {
        this.retiro = retiro;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    
}
