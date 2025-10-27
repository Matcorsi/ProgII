package Recu2;

public class FiltroDiasMas extends Filtro{
    private int dias;

    public FiltroDiasMas(int dias){
        this.dias = dias;
    }

    @Override
    public boolean cumple(Trabajo trabajo){
        return trabajo.cantidadDias() > dias;
    }
}

