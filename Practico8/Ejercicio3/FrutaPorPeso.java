package Practico8.Ejercicio3;

public class FrutaPorPeso extends Fruta{

    public FrutaPorPeso(String nombre, int valor){
        super(nombre, valor);
    }

    @Override
    public int getValorFuerza(Personaje personaje){
        return (int) personaje.getPeso() * super.getValor();
    }
}
