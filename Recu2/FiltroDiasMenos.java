package Recu2;

public class FiltroDiasMenos extends Filtro{
    private int dias;

    public FiltroDiasMenos(int dias){
        this.dias = dias;
    }

    @Override
    public boolean cumple(Trabajo trabajo){
        return trabajo.cantidadDias() < dias;
    }
}
