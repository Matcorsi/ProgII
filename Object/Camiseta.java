package Object;

public class Camiseta extends Objeto{

    private int dorsal;

    public Camiseta(String nombre, int valor, int dorsal){
        super(nombre, valor);
        this.dorsal = dorsal;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public boolean equals(Object obj){
        Camiseta other = (Camiseta) obj;
        return this.getDorsal() == other.getDorsal();
    }
    
}