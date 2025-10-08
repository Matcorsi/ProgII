package Practico4.Ejercicio1;

public class Luz {
    private String luz;

    public Luz(){
        this.luz = "(OOOOOOOOOOOOOOOO)";
    }

    public void setLuz(String luz){
        this.luz = luz;
    }

    public String encender(){
        return luz;
    }
}
