package Practico2.Ejercicio3;
import java.util.ArrayList;


public class Provincia {
    private String nombre;
    private ArrayList<Ciudad> ciudades;

    public Provincia(String nombre){
        this.nombre = nombre;
        this.ciudades = new ArrayList<>();
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void addCiudad(Ciudad ciudad){
        this.ciudades.add(ciudad);
    }

    public int cantHabitantes(){
        int cantidad = 0;
        if(!this.ciudades.isEmpty()){
            for(int i = 0; i < this.ciudades.size(); i++){
                cantidad += this.ciudades.get(i).getHabitantes();
            }
        }
        return cantidad;
    }

    public ArrayList<Ciudad> ciudadGrande(){
        ArrayList<Ciudad> ciudadesGrandes = new ArrayList<>();
        if(!this.ciudades.isEmpty()){
            for(int i = 0; i < this.ciudades.size(); i++){
                if(this.ciudades.get(i).esMayor()){
                    ciudadesGrandes.add(this.ciudades.get(i));
                }
            }
        }
        return ciudadesGrandes;
    }

    public boolean masDeLaMitadDeficit(){
        boolean mitadDeficit = false;
        int cantidad = 0;
        if(!this.ciudades.isEmpty()){
            int tamanio = this.ciudades.size();
            for(int i = 0; i < this.ciudades.size(); i++){
                cantidad += this.ciudades.get(i).deficit();
            }
            if(cantidad > tamanio/2 ){
                System.out.println("La provincia: " + this.nombre + " tiene mas de la mitad de las ciudades con deficit");
                mitadDeficit = true;
            }
        }
        return mitadDeficit;
    }

}
