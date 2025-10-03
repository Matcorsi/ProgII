package Object;

public class Pelota extends Objeto{
    private double presion;

    public Pelota(String nombre, int valor, double presion){
        super(nombre, valor);
        this.presion = presion;
    }

    public double getPresion() {
        return presion;
    }

    public void setPresion(double presion) {
        this.presion = presion;
    }

    
}
