package Practico2.Ejercicio3;

public class Ciudad {
    final private int GRANDE = 100000;
    private String nombre;
    private int cant_habitantes;
    private double imp1, imp2, imp3, imp4, imp5;
    private double gastos_mantenimiento;

    public Ciudad(String nombre, int cant_habitantes){
        this.nombre = nombre;
        this.cant_habitantes = cant_habitantes;
        this.imp1 = 0;
        this.imp2 = 0;
        this.imp3 = 0;
        this.imp4 = 0;
        this.imp5 = 0;
        this.gastos_mantenimiento = 0;
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

    public void setImp1(double imp1){
        this.imp1 = imp1;
    }

    public double getImp1(){
        return this.imp1;
    }

    public void setImp2(double imp2){
        this.imp2 = imp2;
    }

    public double getImp2(){
        return this.imp2;
    }

    public void setImp3(double imp3){
        this.imp3 = imp3;
    }

    public double getImp3(){
        return this.imp3;
    }

    public void setImp4(double imp4){
        this.imp4 = imp4;
    }

    public double getImp4(){
        return this.imp4;
    }

    public void setImp5(double imp5){
        this.imp5 = imp5;
    }

    public double getImp5(){
        return this.imp5;
    }

    public void setGastosMantenimiento(double gastos_mantenimiento){
        this.gastos_mantenimiento = gastos_mantenimiento;
    }

    public double getGastos(){
        return this.gastos_mantenimiento;
    }

    public double totalRecaudado(){
        return this.imp1 + this.imp2 + this.imp3 + this.imp4 + this.imp5;
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
