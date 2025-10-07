package Practico3.Ejercicio4;

import java.util.ArrayList;

public class Celular {
    private String nombre;
    private ArrayList<Contacto> contactos;

    public Celular(String nombre){
        this.contactos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void getContactos() {
        if(!this.contactos.isEmpty()){
            for(Contacto cont : contactos){
                System.out.println(cont.getApellido() + " " + cont.getNombre() + " | Edad: " + cont.getEdad() + " | Telefono: " + cont.getTelefono() + " | Ciudad: " + cont.getCiudad());
            }
        } else {
            System.out.println("No hay contactos agendados");
        }
    }

    public void addContacto(Contacto nuevoContacto){
        this.contactos.add(nuevoContacto);
    }

    public ArrayList<Contacto> getContactosNumeroRepetido() {
        ArrayList<Contacto> listaNumerosRepetidos = new ArrayList<>();

        if (!this.contactos.isEmpty()) {
            for (int i = 0; i < contactos.size(); i++) {
                Contacto cont1 = contactos.get(i);
                for (int j = i + 1; j < contactos.size(); j++) {
                    Contacto cont2 = contactos.get(j);
                    if (cont1.getTelefono().equals(cont2.getTelefono())) {
                        if (!listaNumerosRepetidos.contains(cont1)) {
                            listaNumerosRepetidos.add(cont1);
                        }
                        if (!listaNumerosRepetidos.contains(cont2)) {
                            listaNumerosRepetidos.add(cont2);
                        }
                    }
                }
            }
        } else {
            System.out.println("No hay números agendados");
        }

        return listaNumerosRepetidos;
    }

    public double promedioEdadContactos(){
        double sumaEdades = 0;
        double cantContactos = 0;
        for(Contacto cont : contactos){
            sumaEdades += cont.getEdad();
            cantContactos ++;
        }
        return sumaEdades/cantContactos;
    }

    public ArrayList<Contacto> contactosRepetidos(){
        ArrayList<Contacto> listaRepetidos = new ArrayList<>();
        for(int i = 0; i < contactos.size(); i++){
            Contacto cont1 = contactos.get(i);
            for(int j = i + 1; j < contactos.size(); j++){
                Contacto cont2 = contactos.get(j);
                if(cont1.getNombre().equals(cont2.getNombre()) && cont1.getApellido().equals(cont2.getApellido()) && cont1.getTelefono().equals(cont2.getTelefono())){
                    if (!listaRepetidos.contains(cont1)) {
                        listaRepetidos.add(cont1);
                    }
                    if (!listaRepetidos.contains(cont2)) {
                        listaRepetidos.add(cont2);
                    }
                }
            }
        }
        return listaRepetidos;
    }
    

}
