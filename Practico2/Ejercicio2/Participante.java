package Practico2.Ejercicio2;

public class Participante {
    private String nombre;
    private String telefono;
    private String mail;

    public Participante(String nombre, String telefono, String mail){
        this.nombre = nombre;
        this.telefono = telefono;
        this.mail = mail;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setTelefono(String telefono){
        this.telefono = telefono;
    }

    public String getTelefono(){
        return this.telefono;
    }

    public void setMail(String mail){
        this.mail = mail;
    }

    public String getMail(){
        return this.mail;
    }

    public String toString(){
        return "Nombre: " + nombre + " | Telefono: " + telefono + " | Mail: " + mail;
    }
}
