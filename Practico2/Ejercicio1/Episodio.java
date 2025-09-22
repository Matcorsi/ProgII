package Practico2.Ejercicio1;

public class Episodio{
    private String titulo;
    private String descripcion;
    private boolean flag;
    private int calificacion;

    public Episodio(String titulo, String descripcion){
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.flag = false;
        this.calificacion = -1;
    }

     public String getTitulo(){
        return this.titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getDescripcion(){
        return this.descripcion;
    }

    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }

    public boolean fueVisto(){
        return this.flag;
    }

    public void setFueVisto(boolean flag){
        this.flag = flag;
    }

    public void setCalificacion(int valor){
        if(valor >= 0 && valor <= 5){
            this.calificacion = valor;
            this.flag = true;
        } else {
            System.out.println("Calificación inválida: debe estar entre 0 y 5.");
        }
    }

    public int getCalificacion(){
        return this.calificacion;
    }
}
