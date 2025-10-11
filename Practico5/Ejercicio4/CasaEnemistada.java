package Practico5.Ejercicio4;

public class CasaEnemistada extends Casa{

    public CasaEnemistada(String nombre, int capacidad){
        super(nombre, capacidad);
    }

    @Override
    public void asignarCasaAlumno(Alumno alumno){
        Casa casa_enemiga = this.getCasaEnemiga();
        if(casa_enemiga != null && casa_enemiga.esAceptado(alumno)){
            System.out.println("El alumno es aceptado en la casa enemiga, por lo tanto no puede ingresar a esta!");
        } else {
            this.alumnos.add(alumno);
            alumno.asignarCasa(this);
        }
    }
  
}
