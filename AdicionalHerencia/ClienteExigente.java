package AdicionalHerencia;

import java.util.ArrayList;

public class ClienteExigente extends Cliente{
    
    public ClienteExigente(String nombre, String apellido, String dni, String direccion, int descuento){
        super(nombre, apellido, dni, direccion, descuento);
        this.autoresFavoritos = new ArrayList<>();
        this.generosFavoritos = new ArrayList<>();
        this.listaCompras = new ArrayList<>();
    }

    public boolean leGusta(Articulo articulo){
        boolean leGusta = false;
        if(this.autoresFavoritos.contains(articulo.getAutor())){
            for(String genero : generosFavoritos){
                if(articulo.getGeneros().contains(genero)){
                    leGusta = true;
                    return leGusta;
                }
            }
        }
        return leGusta;
    }
}
