package AdicionalFarmacia;

public class CondicionAnd extends Condicion{
    private Condicion cond1;
    private Condicion cond2;

    public CondicionAnd(Condicion cond1, Condicion cond2){
        this.cond1 = cond1;
        this.cond2 = cond2;
    }

    public boolean cumple(Medicamento med){
        return cond1.cumple(med) && cond2.cumple(med);
    }

}
