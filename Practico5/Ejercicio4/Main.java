package Practico5.Ejercicio4;

public class Main {
    public static void main(String[] args) {

        // ======= CREACIÓN DE CASAS =======
        Casa gryffindor = new CasaLinajeSangre("Gryffindor", 3);
        gryffindor.addCualidadCasa("Valentía");
        gryffindor.addCualidadCasa("Determinación");

        
        Casa slytherin = new CasaEnemistada("Slytherin", 3);
        slytherin.addCualidadCasa("Ambición");
        slytherin.addCualidadCasa("Astucia");

        Casa ravenclaw = new Casa("Ravenclaw", 3);
        ravenclaw.addCualidadCasa("Inteligencia");
        ravenclaw.addCualidadCasa("Creatividad");

        // Establecemos enemistad entre Gryffindor y Slytherin
        gryffindor.setCasaEnemiga(slytherin);
        slytherin.setCasaEnemiga(gryffindor);

        System.out.println("===== CASAS CREADAS =====");
        System.out.println(gryffindor.getNombre() + " | " + slytherin.getNombre() + " | " + ravenclaw.getNombre());
        System.out.println();

        // ======= CREACIÓN DE ALUMNOS =======
        Alumno harry = new Alumno("Harry Potter");
        harry.addCualidad("Valentía");
        harry.addCualidad("Determinación");

        Alumno draco = new Alumno("Draco Malfoy");
        draco.addCualidad("Ambición");
        draco.addCualidad("Astucia");

        Alumno hermione = new Alumno("Hermione Granger");
        hermione.addCualidad("Inteligencia");
        hermione.addCualidad("Creatividad");
        hermione.addCualidad("Determinación"); // extra, para probar aceptación múltiple

        Alumno regulus = new Alumno("Regulus Black");
        regulus.addCualidad("Ambición");
        regulus.addCualidad("Astucia");

        Alumno sirius = new Alumno("Sirius Black");
        sirius.addCualidad("Valentía");
        sirius.addCualidad("Determinación");
        sirius.addFamiliar(regulus); // Regulus es su familiar (en Slytherin más adelante)

        Alumno luna = new Alumno("Luna Lovegood");
        luna.addCualidad("Creatividad");
        luna.addCualidad("Inteligencia");

        // ======= ASIGNACIÓN DE ALUMNOS =======
        System.out.println("===== INICIO DE ASIGNACIÓN =====\n");

        gryffindor.addAlumno(harry);     // ✅ Debería ser aceptado (tiene cualidades)
        slytherin.addAlumno(draco);      // ✅ Debería ser aceptado
        ravenclaw.addAlumno(hermione);   // ✅ Aceptada por cualidades
        slytherin.addAlumno(regulus);    // ✅ Aceptado
        gryffindor.addAlumno(sirius);    // ❌ No tiene familiar en Gryffindor (aún)
        ravenclaw.addAlumno(luna);       // ✅ Aceptada

        System.out.println("\n===== ASIGNACIÓN ADICIONAL =====\n");
        // Agregamos Sirius nuevamente después de que su familiar Regulus esté en Slytherin
        // para ver si ahora puede ser rechazado por casa enemiga.
        gryffindor.addAlumno(sirius); // ❌ debería rechazarlo por linaje o enemistad (según caso)

        // ======= PRUEBAS DE ENEMISTAD =======
        Alumno tom = new Alumno("Tom Riddle");
        tom.addCualidad("Ambición");
        tom.addCualidad("Astucia");
        tom.addCualidad("Determinación"); // tiene cualidades de ambas casas
        slytherin.addAlumno(tom); // ✅ debería aceptarlo
        gryffindor.addAlumno(tom); // ❌ debería rechazarlo por ser aceptado en casa enemiga

        // ======= RESUMEN FINAL =======
        System.out.println("\n===== RESUMEN FINAL =====");
        mostrarCasa(gryffindor);
        mostrarCasa(slytherin);
        mostrarCasa(ravenclaw);
    }

    // Método auxiliar para imprimir los alumnos de cada casa
    public static void mostrarCasa(Casa casa) {
        System.out.println("\nCasa: " + casa.getNombre());
        if (casa.getAlumnos().isEmpty()) {
            System.out.println("  (sin alumnos asignados)");
        } else {
            for (Alumno a : casa.getAlumnos()) {
                System.out.println("  - " + a.getNombre());
            }
        }
    }
}

