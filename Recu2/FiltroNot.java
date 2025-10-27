package Recu2;

public class FiltroNot extends Filtro{
    private Filtro f1;
    
    public FiltroNot(Filtro f1){
        this.f1 = f1;
    }

    @Override
    public boolean cumple(Trabajo trabajo){
        return !f1.cumple(trabajo);
    }
}
