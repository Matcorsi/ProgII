package Practico5.Ejercicio3;

import java.util.Stack;

public class Pila{
    private Stack<Object> pila;

    public Pila(){
        this.pila = new Stack<>();
    }

    public void addElemento(Object elemento){
        this.pila.push(elemento);
    }

    public Object obtenerElemento(){
        return this.pila.pop();
    }

    public Object verProximo(){
        return this.pila.peek();
    }
}
