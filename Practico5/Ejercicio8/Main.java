package Practico5.Ejercicio8;

public class Main {
    public static void main(String[] args) {
        Congreso congreso = new Congreso("Congreso de Ciencias");

        congreso.addTemaGenereal("algoritmos");
        congreso.addTemaGenereal("lenguajes");
        congreso.addTemaExpertos("redes");
        congreso.addTemaExpertos("visualizacion");

        Evaluador e1 = new Evaluador("Ana");
        e1.addConocimiento("algoritmos");
        e1.addConocimiento("lenguajes");

        Evaluador e2 = new Evaluador("Carlos");
        e2.addConocimiento("redes");
        e2.addConocimiento("visualizacion");

        congreso.addEvaluador(e1);
        congreso.addEvaluador(e2);

        Trabajo t1 = new Trabajo("Artículo IA");
        t1.addPalabras_clave("algoritmos");
        t1.addPalabras_clave("lenguajes");

        Poster p1 = new Poster("Poster Redes");
        p1.addPalabras_clave("redes");
        p1.addPalabras_clave("agentes");

        congreso.addTrabajo(t1);
        congreso.addTrabajo(p1);

        congreso.asignarEvaluadores();

        congreso.determinarEvaluador(e1);
        congreso.determinarEvaluador(e2);

        e1.mostrarTrabajosAsignados();
        e2.mostrarTrabajosAsignados();
    }
}
