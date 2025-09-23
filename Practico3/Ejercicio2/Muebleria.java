package Practico3.Ejercicio2;

import java.util.ArrayList;

public class Muebleria {
        private double porcentajaVenta = 1.35;
        private ArrayList<Mueble> muebles_stock;
        
        public Muebleria(){
            this.muebles_stock = new ArrayList<>();
        }

        public void addMueble(Mueble mueble){
            this.muebles_stock.add(mueble);
        }

        public void listaValoresMuebles(){
            
        }

        public double precioVenta(Mueble mueble){
            return mueble.getValor_venta() * porcentajaVenta;
        }


}
