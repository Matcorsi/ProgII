package Object;
import java.util.ArrayList;

public class Objeto {
    private String nombre;
    private int valor;
    private boolean activo;
    private ArrayList<String> caracteristicas;

    public Objeto(String nombre, int valor){
        this.nombre = nombre;
        this.valor = valor;
        this.activo = true;
        this.caracteristicas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public void addCaracteristica(String caracteristica){
        if(!this.caracteristicas.contains(caracteristica)){
            this.caracteristicas.add(caracteristica);
            System.out.println("La caracteristica: " + caracteristica + " ha sido agregada con exito al objeto");
        } else {
            System.out.println("La caracteristica: " + caracteristica + " ya existe para este objeto");
        }
    }

    public ArrayList<String> getCaracteristicas(){
        return this.caracteristicas;
    }

    @Override
    public boolean equals(Object obj){
        Objeto other = (Objeto) obj;
        return this.getNombre().equals(other.getNombre());
    }
    
}
