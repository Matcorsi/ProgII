package Pract2_Ejer2;
import java.util.ArrayList;

public class Reunion {
    private String lugar;
    private String tema;
    private double duracion;
    private ArrayList<Participante> participantes;

    public Reunion(){
        this.participantes = new ArrayList<>();
    }

    public Reunion(String lugar, String tema, double duracion){
        this.lugar = lugar;
        this.tema = tema;
        this.duracion = duracion;
        this.participantes = new ArrayList<>();
    }

    public void setLugar(String lugar){
        this.lugar = lugar;
    }

    public String getLugar(){
        return this.lugar;
    }

    public void setTema(String tema){
        this.tema = tema;
    }

    public String getTema(){
        return this.tema;
    }

    public void setDuracion(double duracion){
        this.duracion = duracion;
    }

    public double getDuracion(){
        return this.duracion;
    }

    public void addParticipante(Participante part){
        this.participantes.add(part);
    }

    public void getParticipantes(){
        if (!this.participantes.isEmpty()) {
            System.out.println("Lista de asistentes: ");
            for(int i = 0; i < this.participantes.size(); i++){
                System.out.println("| " + this.participantes.get(i) + " | ");
            }
        } else {
            System.out.println("No hay participantes para esta reunion");
        }
    }

    public String toString(){
        return "Lugar: " + this.lugar + " | Tema: " + this.tema + " | Duracion: " + this.duracion;
    }
}
