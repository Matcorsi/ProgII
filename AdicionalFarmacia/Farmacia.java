package AdicionalFarmacia;

import java.util.ArrayList;

public class Farmacia {
    private String nombre;
    private ArrayList<Medicamento> medicamentos;
    
    public Farmacia(String nombre){
        this.nombre = nombre;
        this.medicamentos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Medicamento> getMedicamentos() {
        return new ArrayList<>(medicamentos);
    }

    public void addMedicamento(Medicamento medicamento) {
        this.medicamentos.add(medicamento);
    }

    // public ArrayList<Medicamento> buscarMedXLab(String lab){
    //     ArrayList<Medicamento> medicamentosLab = new ArrayList<>();
    //     for(Medicamento med : medicamentos){
    //         if(med.getLaboratorio().equals(lab)){
    //             medicamentosLab.add(med);
    //         }
    //     }
    //     return medicamentosLab;
    // }

    // public ArrayList<Medicamento> buscarMedicamento(String palabra){
    //     ArrayList<Medicamento> medicamentosPalabra = new ArrayList<>();
    //     for(Medicamento med : medicamentos){
    //         if(med.getNombre().contains(palabra)){
    //             medicamentosPalabra.add(med);
    //         }
    //     }
    //     return medicamentosPalabra;
    // }

    // public ArrayList<Medicamento> buscarMedXPrecio(double precio){
    //     ArrayList<Medicamento> medicamentosPrecio = new ArrayList<>();
    //     for(Medicamento med : medicamentos){
    //         if(med.getPrecio() < precio){
    //             medicamentosPrecio.add(med);
    //         }
    //     }
    //     return medicamentosPrecio;
    // }

    // public ArrayList<Medicamento> buscarMedXSintoma(String sintoma){
    //     ArrayList<Medicamento> medicamentosSintoma = new ArrayList<>();
    //     for(Medicamento med : medicamentos){
    //         if(med.getSintomas().contains(sintoma)){
    //             medicamentosSintoma.add(med);
    //         }
    //     }
    //     return medicamentosSintoma;
    // }

    public ArrayList<Medicamento> buscarMedicamentoCondicion(Condicion condicion){
        ArrayList<Medicamento> medCondicion = new ArrayList<>();
        for(Medicamento med : medicamentos){
            if(condicion.cumple(med)){
                medCondicion.add(med);
            }
        }
        return medCondicion;
    }

    

    
}
