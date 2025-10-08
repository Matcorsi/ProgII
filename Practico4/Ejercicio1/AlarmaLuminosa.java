package Practico4.Ejercicio1;

public class AlarmaLuminosa extends Alarma{

    private Luz luz;

    public AlarmaLuminosa(){
        super();
        this.luz = new Luz();
    }

    public String activarAlarma(){
        String timbre = super.activarAlarma();
        String lampara = this.luz.encender();
        return timbre + "\n" + lampara;
    }
}
