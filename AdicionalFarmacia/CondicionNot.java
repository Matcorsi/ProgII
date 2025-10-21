package AdicionalFarmacia;

public class CondicionNot extends Condicion {
    private Condicion condicion;
    public CondicionNot(Condicion condicion) {
        this.condicion = condicion;
    }
    public boolean cumple(Medicamento m) {
        return !condicion.cumple(m);
    }
}

