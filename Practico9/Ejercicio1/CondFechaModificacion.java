package Practico9.Ejercicio1;

import java.time.LocalDate;

public class CondFechaModificacion implements Condicion{
    private LocalDate fecha;

    public CondFechaModificacion(LocalDate fecha){
        this.fecha = fecha;
    }

    @Override
    public boolean cumple(ElementoSA elem){
        return elem.getFechaModificacion().isAfter(fecha);
    }
}


// isBefore(otraFecha) → devuelve true si la fecha actual es anterior a otraFecha.

// isAfter(otraFecha) → devuelve true si la fecha actual es posterior a otraFecha.

// isEqual(otraFecha) → devuelve true si son iguales.