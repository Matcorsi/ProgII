package Practico5.Ejercicio8;

public class Poster extends Trabajo{

    public Poster(String nombre){
        super(nombre);
    }

    @Override
    public boolean estaApto(Evaluador evaluador){
        for(String conocimiento : evaluador.getConocimientos()){
            if(this.getPalabras_clave().contains(conocimiento)){
                this.designarEvaluador(evaluador);
                return true;
            }
        } 
        return false;
    }

}
