package Practico1.Ejercicio1;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
    private String nombre = "N";
    private String apellido = "N";
    private int edad;
    private LocalDate fechaNac = LocalDate.of(2000, 1, 1);
    private int dni;
    private String sexo = "Femenino";
    private double peso = 1;
    private double altura = 1;

    public Persona(int dni){
        this.dni = dni;
        this.edad = Period.between(this.fechaNac, LocalDate.now()).getYears();
    }

    public Persona(int dni, String nombre, String apellido){
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = Period.between(this.fechaNac, LocalDate.now()).getYears();
    }

    public Persona(int dni, String nombre, String apellido, LocalDate fechaNac){
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNac = fechaNac;
        this.edad = Period.between(this.fechaNac, LocalDate.now()).getYears();
    }
    

    public double masaCorporal(){
       return this.peso / (this.altura*this.altura);
    }

    public void estaEnForma(){
        double masaCorporal = this.masaCorporal();
        if(masaCorporal >= 18.5 && masaCorporal <= 25){
            System.out.println("Esta en forma");
        } else {
            System.out.println("No esta en forma");
        }
    }

    public void esSuCumpleaños(){
        LocalDate hoy = LocalDate.now();
        if(hoy.getDayOfMonth() == fechaNac.getDayOfMonth() && hoy.getMonthValue() == fechaNac.getMonthValue()){
                System.out.println("Hoy es su cumpleaños");
        }else {
            System.out.println("Hoy no es su cumpleaños");
        }
    }

    public void esMayorDeEdad(){
        if(this.edad >= 18){
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("No es mayor de edad");
        }
    }

    public void puedeVotar(){
        if(this.edad >= 16){
            System.out.println("Si, puede votar");
        } else {
            System.out.println("No, no puede votar");
        }
    }

    public String infoPersona(){
        return  "Dni: " + this.dni + " | " +
                "Nombre: " + this.nombre + " | " +
                "Apellido: " + this.apellido + " | " +
                "FechaNac: " + this.fechaNac + " | " +
                "Edad: " + this.edad + " | " +
                "Peso: " + this.peso + " | " +
                "Altura: " + this.altura + " | " +
                "Sexo: " + this.sexo + " | ";
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getApellido(){
        return this.apellido;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public int getEdad(){
        return Period.between(this.fechaNac, LocalDate.now()).getYears();
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public LocalDate getFechaNac(){
        return this.fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac){
        this.fechaNac = fechaNac;
    }

    public String getSexo(){
        return this.sexo;
    }

    public void setSexo(String sexo){
        this.sexo = sexo;
    }

    public double getAltura(){
        return this.altura;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    public double getPeso(){
        return this.peso;
    }

    public void setPeso (double peso){
        this.peso = peso;
    }

}

