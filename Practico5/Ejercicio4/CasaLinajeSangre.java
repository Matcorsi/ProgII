package Practico5.Ejercicio4;

public class CasaLinajeSangre extends Casa{

    public CasaLinajeSangre(String nombre, int capacidad){
        super(nombre, capacidad);
    }

    @Override
    public void asignarCasaAlumno(Alumno alumno){
        for(Alumno alum : alumnos){
            if(alumno.getFamiliares().contains(alum)){
                this.alumnos.add(alumno);
                alumno.asignarCasa(this);
                return; // listo, lo agregamos
            }
        }
        System.out.println("El alumno no tiene familiares en esta casa, no puede ingresar.");
    }

}
