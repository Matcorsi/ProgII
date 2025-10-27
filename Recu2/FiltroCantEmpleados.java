package Recu2;

public class FiltroCantEmpleados extends Filtro{
    private int cantEmpleados;

    public FiltroCantEmpleados(int cantidad){
        this.cantEmpleados = cantidad;
    }

    @Override
    public boolean cumple(Trabajo trabajo){
        return trabajo.cantidadEmpleados() < cantEmpleados;
    }
}
