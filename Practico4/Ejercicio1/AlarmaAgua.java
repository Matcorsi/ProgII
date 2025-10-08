package Practico4.Ejercicio1;

public class AlarmaAgua extends Alarma{
    private String agua;

    public AlarmaAgua(){
        super();
        this.agua = "°°°°°°°°°°°°°°°°°°°°°";
    }

    public String tirarAgua(){
        return agua;
    }

    public String activarAlarma(){
        String sonido = super.activarAlarma();
        return sonido + this.tirarAgua();
    }
}
