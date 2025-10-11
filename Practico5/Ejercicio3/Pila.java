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

    public Object pop(){
        if(pila.isEmpty()){
            System.out.println("La pila no contiene objetos aun");
            return null;
        }
        return pila.pop();
    }

    public Object top(){
        if(pila.isEmpty()){
            System.out.println("La pila no contiene objetos aun");
            return null;
        }
        return pila.peek();
    }

    public int tamanioPila(){
        return this.pila.size();
    }

    public Pila copy(){
        Pila copia = new Pila();
        for(Object obj : pila){
            copia.addElemento(obj);
        }
        return copia;
    }

    public Pila reverse(){
        Pila copia = new Pila();
        for(int i = this.pila.size() - 1; i >= 0; i--){
            copia.addElemento(this.pila.get(i));
        }
        return copia;
    }
}
