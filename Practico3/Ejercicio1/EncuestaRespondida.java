package Practico3.Ejercicio1;

import java.util.ArrayList;

public class EncuestaRespondida {
    private Encuesta encuesta;
    private Persona persona;
    private Empleado empleado;
    private ArrayList<Respuesta> respuesta;

    public EncuestaRespondida(Encuesta encuesta, Persona persona, Empleado empleado){
        this.encuesta = encuesta;
        this.persona = persona;
        this.empleado = empleado;
        this.respuesta = new ArrayList<>();
        empleado.completoEncuesta();
    }

    public void agregarRespuesta(Respuesta respuesta){
        this.respuesta.add(respuesta);
    }

    public Encuesta getEncuesta(){
        return this.encuesta;
    }

    public Persona getPersona(){
        return this.persona;
    }

    public Empleado getEmpleado(){
        return this.empleado;
    }

    @Override
    public String toString() {
        return "Nombre encuenta: " + this.encuesta.getNombreEncuesta() + " | Empleado que la realizo: " + this.empleado.getNombre() + " | Persona que respondio: " + this.persona.getNombre() + " | Respuestas: " + this.respuesta;
    }
}
