package Practico4.Ejercicio1;

public class Alarma {
    private boolean vidrio;
    private boolean puerta;
    private boolean ventana;
    private boolean movimiento;
    private Timbre timbre;

    public Alarma(){
        this.vidrio = false;
        this.puerta = false;
        this.ventana = false;
        this.movimiento = false;
        this.timbre = new Timbre();
    }

    public boolean seRompioUnVidrio() {
        return vidrio;
    }

    public void setVidrio(boolean vidrio) {
        this.vidrio = vidrio;
    }

    public boolean seAbrioLaPuerta() {
        return puerta;
    }

    public void setPuerta(boolean puerta) {
        this.puerta = puerta;
    }

    public boolean seAbrioLaVentana() {
        return ventana;
    }

    public void setVentana(boolean ventana) {
        this.ventana = ventana;
    }

    public boolean hayMovimiento() {
        return movimiento;
    }

    public void setMovimiento(boolean movimiento) {
        this.movimiento = movimiento;
    }

    public boolean comprobar(){
        boolean alarma = false;
        if(this.seRompioUnVidrio() || this.seAbrioLaPuerta() || this.seAbrioLaVentana() || this.hayMovimiento()){
            alarma = true;
            System.out.println(activarAlarma());
        }
        return alarma;
    }

    public String activarAlarma(){
        return timbre.hacerSonar();
    }

}
