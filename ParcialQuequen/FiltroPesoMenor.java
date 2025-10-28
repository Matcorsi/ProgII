package ParcialQuequen;

public class FiltroPesoMenor implements Filtro{
    private double peso;

    public FiltroPesoMenor(double peso){
        this.peso = peso;
    }

    @Override
    public boolean cumple(Producto prod){
        return prod.getPeso() < peso;
    }
}
