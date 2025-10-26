package RecuperatorioTresArroyos;

import java.util.ArrayList;

public class Curso extends Paquete{
    private double precio;
    private ArrayList<String> docentes;
    private int cantidad_horas;
    private ArrayList<String> palabras_clave;

    public Curso(String nombre, double precio, int cantidad_horas){
        super(nombre);
        this.precio = precio;
        this.cantidad_horas = cantidad_horas;
        this.docentes = new ArrayList<>();
        this.palabras_clave = new ArrayList<>();
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void addDocente(String docente) {
        if(!docentes.contains(docente)){
            docentes.add(docente);
        }
    }

    public int getCantidad_horas() {
        return cantidad_horas;
    }

    public void setCantidad_horas(int cantidad_horas) {
        this.cantidad_horas = cantidad_horas;
    }

    public void addPalabra_clave(String palabra) {
        if(!palabras_clave.contains(palabra)){
            palabras_clave.add(palabra);
        }
    }

    public boolean contienePalabraClave(String palabra){
        return palabras_clave.contains(palabra);
    }

    public boolean contieneDocente(String docente){
        return docentes.contains(docente);
    }

    @Override
    public int cantidad(){ 
        return 1;
    }

    @Override
    public Paquete cursoMasCaro() {
        return this;
    }

    
}
