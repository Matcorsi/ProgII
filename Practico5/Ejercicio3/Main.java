package Practico5.Ejercicio3;

public class Main {
    public static void main(String[] args) {
        
        Pila pila = new Pila();

        pila.addElemento("A");
        pila.addElemento("B");
        pila.addElemento("C");

        System.out.println("Tope: " + pila.top()); // C
        System.out.println("Tamaño: " + pila.tamanioPila()); // 3

        Pila copia = pila.copy();
        Pila inversa = pila.reverse();

        System.out.println("\nOriginal (pop):");
        while (pila.tamanioPila() > 0) {
            System.out.println(pila.pop());
        }

        System.out.println("\nCopia (pop):");
        while (copia.tamanioPila() > 0) {
            System.out.println(copia.pop());
        }

        System.out.println("\nReversa (pop):");
        while (inversa.tamanioPila() > 0) {
            System.out.println(inversa.pop());
        }
    }
}

