package Practico8.Ejercicio4;

public class Main {
    public static void main(String[] args) {
        TareaSimple t1 = new TareaSimple("Elaborar masa", 100, 30);
        TareaSimple t2 = new TareaSimple("Hornear", 50, 40);
        TareaSimple t3 = new TareaSimple("Desmoldar", 20, 10);

        TareaCompuesta cocina = new TareaCompuesta("Preparar torta", "Cocina");
        cocina.addTarea(t1);
        cocina.addTarea(t2);
        cocina.addTarea(t3);

        System.out.println("Costo total: " + cocina.getCosto());
        System.out.println("Tiempo total: " + cocina.getTiempo() + " min");
        System.out.println(cocina + "| Acciones: " + cocina.getTareas());

        TareaSimple t4 = new TareaSimple("Meter en heladera", 10, 10);
        TareaCompuesta cocina2 = new TareaCompuesta("Enfriar Torta", "Cocina");
        cocina2.addTarea(t4);
        cocina.addTarea(cocina2);

        System.out.println("Costo total: " + cocina.getCosto());
        System.out.println("Tiempo total: " + cocina.getTiempo() + " min");
        System.out.println(cocina + "| Acciones: " + cocina.getTareas());
    }
}
