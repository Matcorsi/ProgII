package Practico9.Ejercicio1;

import java.time.LocalDate;

public class CondFechaCreacion implements Condicion{

    private LocalDate fecha;

    public CondFechaCreacion(LocalDate fecha){
        this.fecha = fecha;
    }

    @Override
    public boolean cumple(ElementoSA elem){
        return elem.getFechaCreacion().isAfter(fecha);
    }
}

  
