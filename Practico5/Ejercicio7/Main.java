package Practico5.Ejercicio7;

public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("Tech Solutions");

        // Empleado común
        Empleado empleado1 = new Empleado("Juan", "Pérez", "27832123", 17000);

        // Empleado con ventas (5% sobre 30000 en ventas)
        EmpleadoVentas empleado2 = new EmpleadoVentas("Martín", "Gómez", "30456789", 15000, 5, 30000);

        // Empleado con ventas (10% sobre 20000 en ventas)
        EmpleadoVentas empleado3 = new EmpleadoVentas("Pablo", "López", "31567890", 13000, 10, 20000);

        // Empleado con bono (1000 si hace al menos 50 ventas)
        EmpleadoBono empleado4 = new EmpleadoBono("Julián", "Martínez", "28976543", 14000, 55, 50, 1000);

        // Empleado con bono (3000 si hace al menos 100 ventas)
        EmpleadoBono empleado5 = new EmpleadoBono("Mauro", "Fernández", "30123456", 16000, 95, 100, 3000);

        // Agregar empleados a la empresa
        empresa.addEmpleados(empleado1);
        empresa.addEmpleados(empleado2);
        empresa.addEmpleados(empleado3);
        empresa.addEmpleados(empleado4);
        empresa.addEmpleados(empleado5);

        // Mostrar sueldos individuales
        System.out.println("Sueldos de los empleados:");
        for (Empleado e : empresa.getEmpleados()) {
            System.out.println(e.getNombre() + " " + e.getApellido() + " - Sueldo: $" + e.getSueldo());
        }

        // Mostrar total de sueldos
        System.out.println("\nTotal en sueldos: $" + empresa.totalSueldos());
    }
}
