package Practico4.Ejercicio5;

import java.time.LocalDate;

public class Fresco extends Producto{
    
    public Fresco(LocalDate fecha_vencimiento, int numero_lote, LocalDate fecha_envasado, String granja_origen){
        super(fecha_vencimiento, numero_lote, fecha_envasado, granja_origen);
    }

}
