package Practico5.Ejercicio5;

public class Lote extends Cooperativa{
    private String tipoLote;

    public Lote(String nombre){
        super(nombre);
        this.tipoLote = setTipo();
    }

    public String tipoDeLote(){
        return this.tipoLote;
    }

    public String setTipo(){
        if(esEspecial()){
            return "Especial";
        }
        if(esComun()){
            return "Comun";
        } else {
            return null;
        }
    }

    public boolean esEspecial(){
        boolean esEspecial = true;
        for(String min : minerales){
            if(!(super.getMineralesPrimarios().contains(min))){
                esEspecial = false;
            } 
        }
        return esEspecial;
    }

    public boolean esComun(){
        boolean esComun = true;
        for(String min : minerales){
            if (!(super.getMineralesSecundarios().contains(min))) {
                esComun = false;
            }
        }
        return esComun;
    }

}