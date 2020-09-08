

public class Turril
{
    private int capacidad; //litros
    private int cantidadAgua; //litros
    public Turril(){
        capacidad = 210;
        cantidadAgua=0;
    }
    public void cargarAgua(){
        cantidadAgua=capacidad;
    }
    public int getCapacidad(){
        return capacidad;
    }
    public int getCantidadAgua(){
        return cantidadAgua;
    }
    public void setCapacidad(int nCapacidad){
        capacidad=nCapacidad;
    }
    public void setCantidadAgua(int nCantidadAgua){
        cantidadAgua=nCantidadAgua;
    }
    
}
