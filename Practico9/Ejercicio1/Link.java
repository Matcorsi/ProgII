package Practico9.Ejercicio1;

public class Link extends ElementoSA{
    private ElementoSA referencia;

    public Link(String nombre, ElementoSA referencia){
        super(nombre);
        this.referencia = referencia;
    }

    public ElementoSA getReferencia(){
        return referencia;
    }

    @Override
    public double getTamanio(){
        return 1;
    }

}
