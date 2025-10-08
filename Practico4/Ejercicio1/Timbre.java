package Practico4.Ejercicio1;

public class Timbre {
    private String sonido;

    public Timbre(){
        this.sonido = "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!";
    }

    public void setSonido(String sonido){
        this.sonido = sonido;
    }

    public String hacerSonar(){
        return sonido;
    }

}
