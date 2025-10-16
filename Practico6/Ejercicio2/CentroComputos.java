package Practico6.Ejercicio2;

import java.util.Stack;

public class CentroComputos {
    private Stack<Computadora> computadoras;
    private Stack<Proceso> procesos;

    public CentroComputos(){
        this.computadoras = new Stack<>();
        this.procesos = new Stack<>();
    }

    public Stack<Computadora> getComputadoras(){
        return this.computadoras;
    }

    public Stack<Proceso> getProcesos(){
        return this.procesos;
    }

    public void addComputadora(Computadora comp){
        if(computadoras.isEmpty()){
            computadoras.push(comp);
        } else {
            boolean inserto = false;
            for(int i = 0; i < computadoras.size(); i++){
                Computadora compu = computadoras.get(i);
                if(comp.getVelocidad() > compu.getVelocidad()){
                    computadoras.add(i, comp);
                    inserto = true;
                    break;
                }
            }
            if(!inserto){
                computadoras.push(comp);
            }
        }
    }

    public void addProceso(Proceso proceso){
        if(!computadoras.isEmpty()){
            Computadora compu = computadoras.pop();
            compu.ejecutar(proceso);
        } else {
            boolean inserto = false;
            for(int i = 0; i < procesos.size(); i++){
                Proceso proc = procesos.get(i);
                if(proc.getMemoria() > proceso.getMemoria()){
                    procesos.add(i, proceso);
                    inserto = true;
                    break;
                }
            }
            if(!inserto){
                procesos.push(proceso);
            }
        }
    }

    public void ejecutar(Proceso proceso){
        Computadora compu = computadoras.pop();
        compu.ejecutar(proceso);
    }
    
}
