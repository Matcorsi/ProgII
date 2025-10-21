package AdicionalFarmacia;

public class CondicionSintoma extends Condicion{
    private String sintoma;

    public CondicionSintoma(String sintoma){
        this.sintoma = sintoma;
    };

    public boolean cumple(Medicamento med){
        return med.getSintomas().contains(sintoma);
    }
}
