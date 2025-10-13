package Practico5.Ejercicio6;

import java.util.ArrayList;

public class Ciudad {
    final private int GRANDE = 100000;
    private String nombre;
    private int cant_habitantes;
    private double gastos_mantenimiento;
    private ArrayList<Contribuyente> contribuyentes;

    public Ciudad(String nombre, int cant_habitantes){
        this.nombre = nombre;
        this.cant_habitantes = cant_habitantes;
        this.gastos_mantenimiento = 0;
        this.contribuyentes = new ArrayList<>();
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setHabitantes(int habitantes){
        this.cant_habitantes = habitantes;
    }

    public int getHabitantes(){
        return this.cant_habitantes;
    }

    public void addContribuyente(Contribuyente contribuyente){
        this.contribuyentes.add(contribuyente);
    }

    public ArrayList<Contribuyente> getContribuyentes(){
        return this.contribuyentes;
    }

    public void setGastosMantenimiento(double gastos_mantenimiento){
        this.gastos_mantenimiento = gastos_mantenimiento;
    }

    public double getGastos(){
        return this.gastos_mantenimiento;
    }

    public double totalRecaudado(){
        double total = 0;
        for(Contribuyente contri : contribuyentes){
            total += contri.totalAbonar();
        }
        return total;
    }

    public boolean esMayor(){
        return this.cant_habitantes > GRANDE;
    }

    public int deficit(){
        int tieneDeficit = 0;
        double deficit = this.totalRecaudado() - this.getGastos();
        if(deficit < 0){
            System.out.println("La ciudad " + this.nombre + " tiene un deficit de: " + deficit);
            tieneDeficit = 1;
        }
        return tieneDeficit;
    }
}
