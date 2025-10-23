package Practico8.Ejercicio2;

import java.util.ArrayList;

public class ComboPostal extends ElementoPostal{
    private ArrayList<ElementoPostal> envios;

    public ComboPostal(String codigo, String ciudad_destino, String direc_destinatario, String direc_remitente){
        super(codigo, ciudad_destino, codigo, ciudad_destino);
        this.envios = new ArrayList<>();
    }

    public ArrayList<ElementoPostal> getEnvios() {
        return new ArrayList<>(envios);
    }

    public void addPaquete(ElementoPostal envio) {
        if(envio.getCiudad_destino().equals(this.getCiudad_destino())){
            if(!envios.contains(envio)){
                envios.add(envio);
                envio.setCodigo_seguimiento(this.getCodigo_seguimiento());
            }
        } else {
            System.out.println("No tiene la misma ciudad de destino");
        }
    }

    public double getPeso(){
        double pesoTotal = 0;
        for(ElementoPostal elem : envios){
            pesoTotal += elem.getPeso();
        }
        return pesoTotal;
    }

    @Override
    public String getDirec_destinatario(){
        return envios.get(0).getDirec_destinatario();
    }

    @Override
    public String getDirec_remitente(){
        return envios.get(0).getDirec_remitente();
    }

    @Override
    public void setCodigo_seguimiento(String codigo){
        super.setCodigo_seguimiento(codigo);
        for(ElementoPostal elem : envios){
            elem.setCodigo_seguimiento(codigo);
        }
    }





    

    
}
