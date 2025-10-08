package Practico4.Ejercicio2;

import java.util.ArrayList;

public class AlarmaSensorial {
    public ArrayList<Sensor> sensores;
    private Timbre sonido;

    public AlarmaSensorial(){
        this.sensores = new ArrayList<>();
        this.sonido = new Timbre();
    }

    public void addSensor(Sensor sensor){
        this.sensores.add(sensor);
    }

    public void controlar(){
        boolean activar = false;
        for(Sensor sensor : sensores){
            if(sensor.getEstado()){
                System.out.println("Problemas en el sector: " + sensor.getNombre());
                if(!activar){
                    activar = true;
                }
            }
        }
        if (activar) {
            System.out.println(activarAlarma());
        } else {
            System.out.println("Todo funciona correctamente");
        }
    }

    public String activarAlarma(){
        return sonido.hacerSonar();
    }


}
