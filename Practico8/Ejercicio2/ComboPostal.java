package Practico8.Ejercicio2;

import java.util.ArrayList;

public class ComboPostal extends ElementoPostal{
    private ArrayList<ElementoPostal> envios;
    private String ciudad_destino;

    public ComboPostal(String codigo, String ciudad_destino, String direc_destinatario, String direc_remitente){
        super(codigo, ciudad_destino, codigo, ciudad_destino);
        this.envios = new ArrayList<>();
    }

    public ArrayList<ElementoPostal> getEnvios() {
        return new ArrayList<>(envios);
    }

    public void addPaquete(ElementoPostal envio) {
        if(envio.getCiudad_destino().equals(ciudad_destino)){
            if(!envios.contains(envio)){
                envios.add(envio);
                for(ElementoPostal elem : envios){
                    elem.setCodigo_seguimiento(this.getCodigo_seguimiento());

                }
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



    

    
}
