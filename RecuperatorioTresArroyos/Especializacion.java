package RecuperatorioTresArroyos;

import java.util.ArrayList;

public class Especializacion extends Paquete{
    private double descuento;
    private static double tope;
    private Condicion filtro;
    private ArrayList<Paquete> elementos;

    public Especializacion(String nombre){
        super(nombre);
        this.elementos = new ArrayList<>();
    }
    
    public Especializacion(String nombre, double descuento, Condicion filtro){
        super(nombre);
        this.descuento = descuento;
        this.filtro = filtro;
        this.elementos = new ArrayList<>();
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public static void setTope(double tope){
        Especializacion.tope = tope;
    }

    public void setFiltro(Condicion filtro) {
        this.filtro = filtro;
    }

    public void addElemento(Paquete elemento) {
        if(filtro.cumple(elemento)){
            elementos.add(elemento);
        }
    }

    public ArrayList<Paquete> getElementos(){
        return new ArrayList<>(elementos);
    }

    @Override
    public ArrayList<String> getDocentes(){
        ArrayList<String> retorno = new ArrayList<>();
        for(Paquete ee : elementos){
            ArrayList<String> docentesHijo = ee.getDocentes();
            for(String docente : docentesHijo){
                if(!retorno.contains(docente)){
                    retorno.add(docente);
                }
            }
        }
        return retorno;
    }


    @Override
    public double getPrecio() {
        double total = 0;
        for(Paquete ee : elementos){
            total += ee.getPrecio();
        }
        double desc = descuento * cantidad();
        if(desc > tope){
            desc = tope;
        }
        total = total-total*desc;
        return total;
    }

    @Override
    public int getCantidad_horas(){
        int total = 0;
        for(Paquete ee : elementos){
            total += ee.getCantidad_horas();
        }
        return total;
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
    public ArrayList<String> getPalabrasClave(){
        ArrayList<String> palabrasClaveRetorno = new ArrayList<>();
        for(Paquete ee : elementos){
            ArrayList<String> palabrasHijo = ee.getPalabrasClave();
            for(String palabra : palabrasHijo){
                if(!palabrasClaveRetorno.contains(palabra)){
                    palabrasClaveRetorno.add(palabra);
                }
            }
        }
        return palabrasClaveRetorno;
    }

    @Override
    public Curso cursoMasCaro(){
        Curso masCaro = null;
        for(Paquete ee : elementos){
            Curso hijo = ee.cursoMasCaro();
            if (hijo != null) {
                if (masCaro == null || hijo.getPrecio() > masCaro.getPrecio()) {
                    masCaro = hijo;
                }
            }
        }
        return masCaro;
    }

    @Override
    public ArrayList<Curso> buscar(Condicion cond){
        ArrayList<Curso> retorno = new ArrayList<>();
        for(Paquete ee : elementos){
            retorno.addAll(ee.buscar(cond));
        }
        return retorno;
    }

    @Override
    public Paquete getCopia(){
        Especializacion copiaEspecializacion = new Especializacion(this.getNombre(),this.descuento, this.filtro);
        for(Paquete ee : elementos){
            Paquete copiaHijo = ee.getCopia();
            copiaEspecializacion.addElemento(copiaHijo);
        }
        return copiaEspecializacion;
    }


}

    
