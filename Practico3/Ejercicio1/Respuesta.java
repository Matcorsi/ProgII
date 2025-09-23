package Practico3.Ejercicio1;

public class Respuesta {
    private Pregunta pregunta;
    private String respuesta;

    public Respuesta(Pregunta pregunta, String respuesta){
        this.pregunta = pregunta;
        this.respuesta = respuesta;
    }

    public void setRespuesta(String respuesta){
        this.respuesta = respuesta;
    }

    public String getRespuesta(){
        return this.respuesta;
    }

    @Override
    public String toString() {
        return "Pregunta: " + pregunta.getPregunta() + " | Respuesta: " + respuesta;
    }

}
