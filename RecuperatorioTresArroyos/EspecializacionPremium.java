package RecuperatorioTresArroyos;

public class EspecializacionPremium extends Especializacion{
    
    public EspecializacionPremium(String nombre){
        super(nombre);
    }

    @Override
    public double getPrecio() {
        double total = 0;
        for(Paquete ee : this.getElementos()){
            total += ee.getPrecio();
        }
        return total;
    }
}
