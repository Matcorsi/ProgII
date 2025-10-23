package Practico6.Ejercicio2;

public class Main {
    public static void main(String[] args) {
        CentroComputos centro = new CentroComputos();

        Computadora compu1 = new Computadora("Samsung", 3.5);
        Proceso proceso1 = new Proceso("Crear usuarios", 800);

        // Agrego procesos antes que computadoras
        centro.addProceso(new Proceso("Proceso A", 512));
        centro.addProceso(new Proceso("Proceso B", 1024));
        centro.addProceso(new Proceso("Proceso C", 256));
        centro.addProceso(proceso1);

        // Ahora agrego computadoras
        centro.addComputadora(new Computadora("PC1", 2.0));
        centro.addComputadora(new Computadora("PC2", 2.5));
        centro.addComputadora(compu1);

        centro.ejecutar(proceso1);

        System.out.println(centro.getComputadoras());
        System.out.println(centro.getProcesos());

    
    }
}
