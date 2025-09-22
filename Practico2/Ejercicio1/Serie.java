package Practico2.Ejercicio1;

import java.util.ArrayList;

public class Serie {
    private String titulo;
    private String descripcion;
    private String creador;
    private String genero;
    private ArrayList<Temporada> temporadas;

    public Serie(String titulo){
        this.titulo = titulo;
    }

    public Serie(String titulo, String descripcion, String creador, String genero){
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.creador = creador;
        this.genero = genero;
        this.temporadas = new ArrayList<>();
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

    public String getCreador(){
        return this.creador;
    }

    public void setCreador(String creador){
        this.creador = creador;
    }

    public String getGenero(){
        return this.genero;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }

    public void addTemporada(Temporada temp){
        this.temporadas.add(temp);
    }

    public String cantEpisodiosVistos(){
        int cantVistos = 0;
        if (!this.temporadas.isEmpty()) {
            for(int i = 0; i < this.temporadas.size(); i++){
                cantVistos += this.temporadas.get(i).cantidadEpisodiosVistos();
            }
        } else {
            System.out.println("La serie no tiene temporadas disponibles");
        }
        return "La cantidad de episodios vistos en la serie es de: " + cantVistos;
    }

    public double califPromedioSerie(){
        double promedio;
        int valorDivisor = 0;
        double valor = 0;
        if(!this.temporadas.isEmpty()){
            for(int i = 0; i < this.temporadas.size(); i++){
                valor += this.temporadas.get(i).promCalifTemp();
                valorDivisor++;
            }
        } else {
            System.out.println("La serie no tiene temporadas disponibles");
        }
        promedio = valor/valorDivisor;
        return promedio;
    }

    public String fueVistaCompleta(){
        boolean fueVistaCompleta = true;
        if(!this.temporadas.isEmpty()){
            int i = 0;
            while(i < this.temporadas.size() && fueVistaCompleta){
                if(this.temporadas.get(i).seVioCompleta()){
                    i++;
                } else {
                    fueVistaCompleta = false;
                };
            }
        } else {
            System.out.println("La serie no tiene temporadas disponibles");
        }
        return "La serie se vio completa: " + fueVistaCompleta;
    }
}
