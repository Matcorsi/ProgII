package Practico4.Ejercicio3;

public class Main {

    public static void main(String[] args) {
        Empleado e1 = new Empleado("Ana", "12345678", 50000);
        EmpleadoHorasExtras e2 = new EmpleadoHorasExtras("Carlos", "87654321", 40000, 10, 2000);
        EmpleadoComision e3 = new EmpleadoComision("Lucía", "11223344", 45000, 15, 5);

        e1.mostrarSalario();
        e2.mostrarSalario();
        e3.mostrarSalario();
    }
}
