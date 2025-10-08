package Practico4.Ejercicio2;

public class Main {
    public static void main(String[] args) {
        AlarmaSensorial alarma = new AlarmaSensorial();

        Sensor sensor1 = new Sensor("Cocina");
        Sensor sensor2 = new Sensor("Living");
        Sensor sensor3 = new Sensor("Baño");
        Sensor sensor4 = new Sensor("Habitacion 1");
        Sensor sensor5 = new Sensor("Habitacion 2");
        Sensor sensor6 = new Sensor("Garaje");

        alarma.addSensor(sensor1);
        alarma.addSensor(sensor2);
        alarma.addSensor(sensor3);
        alarma.addSensor(sensor4);
        alarma.addSensor(sensor5);
        alarma.addSensor(sensor6);

        // System.out.println(alarma.activarAlarma());

        alarma.controlar();

        sensor1.setEstado(true);
        sensor5.setEstado(true);

        alarma.controlar();


    }
}

