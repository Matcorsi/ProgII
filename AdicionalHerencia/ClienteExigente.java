package AdicionalHerencia;

public class ClienteExigente extends Cliente{
    
    public ClienteExigente(String nombre, String apellido, String dni, String direccion, int descuento){
        super(nombre, apellido, dni, direccion, descuento);
    }

    public boolean leGusta(Articulo articulo){
        boolean leGusta = false;
        if(this.getAutoresFavoritos().contains(articulo.getAutor())){
            for(String genero : this.getGenerosFavoritos()){
                if(articulo.getGeneros().contains(genero)){
                    leGusta = true;
                    return leGusta;
                }
            }
        }
        return leGusta;
    }
}
