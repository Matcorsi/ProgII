package RecuperatorioTresArroyos;

public class CondContienePalabraClave implements Condicion{
    private String palabra;

    public CondContienePalabraClave(String palabra){
        this.palabra = palabra;
    }

    @Override
    public boolean cumple(Paquete elem){
        return elem.getPalabrasClave().contains(palabra);
    }
}
