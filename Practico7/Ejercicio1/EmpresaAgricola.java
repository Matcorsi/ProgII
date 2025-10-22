package Practico7.Ejercicio1;

import java.util.ArrayList;

public class EmpresaAgricola{
    private String nombre;
    private ArrayList<Producto> productos;
    private ArrayList<Cultivo> cultivos;
    
    public EmpresaAgricola(String nombre){
        this.nombre = nombre;
        this.productos = new ArrayList<>();
        this.cultivos = new ArrayList<>();
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Producto> getProductos() {
        return new ArrayList<>(productos);
    }

    public void addProducto(Producto producto) {
        if(!productos.contains(producto)){
            productos.add(producto);
        }
    }

    public ArrayList<Cultivo> getCultivos() {
        return new ArrayList<>(cultivos);

    }

    public void addCultivos(Cultivo cultivo) {
        if(!cultivos.contains(cultivo)){
            cultivos.add(cultivo);
        }
    }

    public ArrayList<Producto> getProductosQueTratan(Condicion condicion){
        ArrayList<Producto> productos2 = new ArrayList<>();
        for(Producto producto : productos){
            if(condicion.cumple(producto)){
                productos2.add(producto);
            }
        }
        return productos2;
    }

    public ArrayList<Producto> getProductosQueTratan(Cultivo cultivo, Enfermedad enfermedad) {
        Condicion cond = new CondicionAnd(
            new CondicionCultivo(cultivo),
            new CondicionEnfermedad(enfermedad)
        );
        return getProductosQueTratan(cond);
    }
 

}
