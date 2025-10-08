package Practico4.Ejercicio6;

public class Main {
    public static void main(String[] args) {
        
        // Creamos la empresa
        Empresa empresa = new Empresa();

        // Creamos algunos empleados
        Empleado emp1 = new Empleado("Carlos", "Pérez", 35, 101, 250000);
        Empleado emp2 = new Empleado("Lucía", "Fernández", 29, 102, 230000);
        Empleado emp3 = new Empleado("Matías", "Gómez", 41, 103, 270000);

        // Creamos usuarios finales
        Usuario user1 = new Usuario("María", "López", 26, "mlopez", "pass123");
        Usuario user2 = new Usuario("Julián", "Sosa", 32, "jsosa", "abc456");

        // Creamos un jerárquico y le asignamos empleados a cargo
        Jerarquico jefe = new Jerarquico("Andrea", "Martínez", 45, 200, 450000);
        jefe.addEmpleado(emp1);
        jefe.addEmpleado(emp2);
        jefe.addEmpleado(emp3);

        // Asociamos todas las personas a la empresa
        empresa.asociarPersona(emp1);
        empresa.asociarPersona(emp2);
        empresa.asociarPersona(emp3);
        empresa.asociarPersona(user1);
        empresa.asociarPersona(user2);
        empresa.asociarPersona(jefe);

        // Mostramos empleados a cargo del jerárquico
        System.out.println("Empleados a cargo de " + jefe.getNombre() + ":");
        jefe.verEmpleadoACargo();
        System.out.println("------------------------------------");

        // Exportamos el string de asociados
        System.out.println("Listado de asociados:");
        System.out.println(empresa.exportarStringAsociados());
    }
}
