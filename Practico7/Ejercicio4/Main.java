package Practico7.Ejercicio4;

import java.util.ArrayList;

public class Main {
     public static void main(String[] args) {
        Tablero tablero = new Tablero(1000);

        Ficha chocolate = new Ficha(1,1,0);
        Ficha piedra = new Ficha(6,1,0);
        Ficha carameloRayas = new Ficha(1,1,10);
        Ficha torta = new Ficha(8,4,4);
        FichaEspecial fichaEspecial = new FichaEspecial(9,3,0); // poder calculado = 3

        tablero.addFicha(chocolate);
        tablero.addFicha(piedra);
        tablero.addFicha(carameloRayas);
        tablero.addFicha(torta);
        tablero.addFicha(fichaEspecial);

        // Filtros individuales
        Filtro f1 = new FiltroDestruccion(2, ">");
        Filtro f2 = new FiltroLugar(4, ">");
        Filtro f3 = new FiltroFortaleza(5, ">");

        // Combinaciones lógicas
        Filtro f4 = new FiltroAnd(f1,f3);
        Filtro f5 = new FiltroOr(f2,f3);
        Filtro f6 = new FiltroNot(f1);

        // Mostrar resultados
        mostrar("Destruccion > 2", tablero.buscarFicha(f1));
        mostrar("Espacio > 4", tablero.buscarFicha(f2));
        mostrar("Fortaleza > 5", tablero.buscarFicha(f3));
        mostrar("Destruccion >2 AND Fortaleza>5", tablero.buscarFicha(f4));
        mostrar("Espacio>4 OR Fortaleza>5", tablero.buscarFicha(f5));
        mostrar("NOT Destruccion>2", tablero.buscarFicha(f6));
    }

    private static void mostrar(String titulo, ArrayList<Ficha> fichas){
        System.out.println("\n=== "+titulo+" ===");
        for(Ficha f : fichas){
            System.out.println("- Ficha: Fortaleza=" + f.getFortaleza() + ", Espacio=" + f.getEspacio() + ", Destruccion=" + f.getDestruccion());
        }
    }
}
