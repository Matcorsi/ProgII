package Practico4.Ejercicio4;

import java.time.LocalDate;

public class Entrenador extends Integrante{
    private String identificador;
    
    public Entrenador(String nombre, String apellido, String num_pasaporte, LocalDate fecha_nac, String estado, String identificador){
        super(nombre, apellido, num_pasaporte, fecha_nac, estado);
        this.identificador = identificador;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    
}
