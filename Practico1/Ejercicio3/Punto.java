package Practico1.Ejercicio3;

public class Punto {
    private int x = 0, y = 0;

    public Punto(){
        
    }

    public void desplazarCoordinadas(int despX, int despY){
        this.x += despX;
        this.y += despY;
    }

    public int calcularEuclidea(int xBis, int yBis){
        int distancia = (this.x - xBis)*(this.x - xBis) + (this.y - yBis)*(this.y - yBis);
        return distancia*distancia;
    }
}
