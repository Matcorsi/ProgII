package Practico4;

import java.time.LocalDate;
import java.time.Period;

public class Contacto {
    private String nombre;
    private String apellido;
    private LocalDate fecha_nac;
    private String telefono;
    private String direccion;
    private String ciudad;
    private String email;

    public Contacto(String nombre, String apellido, LocalDate fecha_nac, String telefono, String direccion, String email, String ciudad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha_nac = fecha_nac;
        this.telefono = telefono;
        this.direccion = direccion;
        this.email = email;
        this.ciudad = ciudad;
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

    public LocalDate getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(LocalDate fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getEdad(){
        LocalDate hoy = LocalDate.now();
        LocalDate fechaNac = this.getFecha_nac();

        return Period.between(fechaNac, hoy).getYears();
    }

    @Override
    public String toString(){
        return this.getApellido() + " " + this.getNombre() 
        + " | Telefono: " + this.getTelefono() 
        + " | Email: " + this.getEmail() 
        + " | Direccion: " + this.getDireccion() 
        + " | Ciudad: " + this.getCiudad() 
        + " | Edad: " + this.getEdad();
    }

    
}
