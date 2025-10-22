package Practico7.Ejercicio4;

public class FichaEspecial extends Ficha{

    public FichaEspecial(int fortaleza, int espacio, int destruccion){
        super(fortaleza, espacio, destruccion);
    }

    @Override
    public int getDestruccion() {
        return this.getFortaleza()/this.getEspacio();
    }
}
