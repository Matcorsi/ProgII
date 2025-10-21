package AdicionalHerencia;

import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private String apellido;
    private String dni;
    private String direccion;
    private int descuento;
    protected ArrayList<String> autoresFavoritos;
    protected ArrayList<String> generosFavoritos;
    protected ArrayList<Articulo> listaCompras;

    public Cliente(String nombre, String apellido, String dni, String direccion, int descuento){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.direccion = direccion;
        this.descuento = descuento;
        this.autoresFavoritos = new ArrayList<>();
        this.generosFavoritos = new ArrayList<>();
        this.listaCompras = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getDescuento() {
        return descuento/100.0;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public ArrayList<String> getAutoresFavoritos() {
        return new ArrayList<String>(autoresFavoritos);

    }

    public void addAutorFavorito(String autorFavorito) {
        if(!autoresFavoritos.contains(autorFavorito)){
            autoresFavoritos.add(autorFavorito);
        } else {
            System.out.println("El autor ya se encuentra entre los favoritos");
        }
    }

    public ArrayList<String> getGenerosFavoritos() {
        return new ArrayList<String>(generosFavoritos);

    }

    public void addGenerosFavoritos(String generoFavorito) {
        if(!generosFavoritos.contains(generoFavorito)){
            generosFavoritos.add(generoFavorito);
        } else {
            System.out.println("El genero ya se encuentra entre los favoritos");
        }
    }

    public ArrayList<Articulo> getListaCompras() {
        return new ArrayList<Articulo>(listaCompras);

    }

    public void addListaCompras(Articulo articulo) {
        this.listaCompras.add(articulo);
    }

    public boolean yaCompro(Articulo articulo){
        return this.getListaCompras().contains(articulo);
    }

    public boolean leGusta(Articulo articulo){
        return this.autoresFavoritos.contains(articulo.getAutor());
    };

    

}
