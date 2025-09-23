package Practico3.Ejercicio1;

public class AppEncuestas {

    public static void main(String[] args) {
        Encuesta LosPulpos = new Encuesta("Aniversario Pulpos");
        Pregunta preg1 = new Pregunta("¿Que te parece la fecha elegida para el aniversario?");
        Pregunta preg2 = new Pregunta("¿Que te parece hacer un asado?");
        Pregunta preg3 = new Pregunta("¿Que te parece que se haga una fiesta?");
        LosPulpos.AgregarPregunta(preg1);
        LosPulpos.AgregarPregunta(preg2);
        LosPulpos.AgregarPregunta(preg3);

        Persona pedro = new Persona("Pedro", 40434948);
        Persona demis = new Persona("Demis", 40455869);

        Empleado mateo = new Empleado("Mateo", 1);

        Respuesta respuesta1 = new Respuesta(preg1, "Me parece una buena fecha");
        Respuesta respuesta2 = new Respuesta(preg2, "Estoy de acuerdo con realizar un asado");
        Respuesta respuesta3 = new Respuesta(preg3, "No me gusta mucho la idea de la fiesta");


        EncuestaRespondida encuestaCompletada1 = new EncuestaRespondida(LosPulpos, demis, mateo);
        encuestaCompletada1.agregarRespuesta(respuesta1);
        encuestaCompletada1.agregarRespuesta(respuesta2);
        encuestaCompletada1.agregarRespuesta(respuesta3);

        Respuesta respuesta1Pedro = new Respuesta(preg1, "No estoy de acuerdo");
        EncuestaRespondida encuestaCompletada2 = new EncuestaRespondida(LosPulpos, pedro, mateo);
        encuestaCompletada2.agregarRespuesta(respuesta1Pedro);

        System.out.println(encuestaCompletada1);
        System.out.println(encuestaCompletada2);

    }
}
