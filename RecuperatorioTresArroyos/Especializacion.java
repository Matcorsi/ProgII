package RecuperatorioTresArroyos;

import java.util.ArrayList;

public class Especializacion extends Paquete{
    private int descuento;
    private ArrayList<Paquete> elementos;
    
    public Especializacion(String nombre, int descuento){
        super(nombre);
        this.descuento = descuento;
        this.elementos = new ArrayList<>();
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public boolean contienePalabraClave(String palabra){
        for(Paquete ee : elementos){
            if(ee.contienePalabraClave(palabra)){
                return true;
            }
        }
        return false;
    }

    public void addElemento(Paquete elemento, Condicion cond) {
        if(cond.cumple(elemento)){
            elementos.add(elemento);
        }
    }

    @Override
    public double getPrecio() {
        double total = 0;

        // 1. Sumamos los precios de todos los elementos
        for (Paquete p : elementos) {
            total += p.getPrecio();
        }

        // 2. Calculamos el descuento por curso en valor monetario
        int cantidadCursos = cantidad();
        double descuentoPorCurso = descuento / 100.0; // ej: 2% = 0.02
        double descuentoTotal = total * cantidadCursos * descuentoPorCurso;

        // 3. Aplicamos el tope de descuento
        double maxDescuento = total * getTope() / 100.0; // ej: tope = 50%
        if (descuentoTotal > maxDescuento) {
            descuentoTotal = maxDescuento;
        }

        // 4. Precio final
        return total - descuentoTotal;
    }


    @Override
    public int cantidad(){
        int total = 0;
        for(Paquete ee : elementos){
            total += ee.cantidad();
        }
        return total;
    }

    @Override
    public Paquete cursoMasCaro(){
        Paquete masCaro = null;
        for(Paquete ee : elementos){
            Paquete candidato = ee.cursoMasCaro();
            if (candidato != null) {
                if (masCaro == null || candidato.getPrecio() > masCaro.getPrecio()) {
                    masCaro = candidato;
                }
            }
        }
        return masCaro;
    }
}

    
