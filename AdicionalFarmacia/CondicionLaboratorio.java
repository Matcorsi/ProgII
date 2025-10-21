package AdicionalFarmacia;

public class CondicionLaboratorio extends Condicion{
    private String laboratorio;

    public CondicionLaboratorio(String laboratorio){
        this.laboratorio = laboratorio;
    };

    public boolean cumple(Medicamento med){
        return med.getLaboratorio().equals(laboratorio);
    }
}
