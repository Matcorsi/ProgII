package Practico4.Ejercicio6;

import java.util.ArrayList;

public class Empresa {

    private ArrayList<Persona> asociados;
     
    public Empresa(){
        this.asociados = new ArrayList<>();
    }

    public void asociarPersona(Persona persona){
        this.asociados.add(persona);
    }

    public ArrayList<Persona> getAsociados(){
        return this.asociados;
    }

    public String exportarStringAsociados() {
        String datosConcatenados = "";
        for (Persona asoc : asociados) {
            datosConcatenados += asoc.toString() + "\n";
        }
        return datosConcatenados;
    }
}
