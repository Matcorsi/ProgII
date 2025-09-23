package Pract2_Ejer4;

public class Usuario {
    private String nombre;
    private boolean socio;

    public Usuario(String nombre){
        this.nombre = nombre;
        this.socio = false;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setSocio(boolean socio){
        this.socio = socio;
    }

    public boolean getSocio(){
        return this.socio;
    }
}
