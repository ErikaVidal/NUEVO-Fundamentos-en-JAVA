
public class TanqueAgua
{
   private int capacidad;
   private int cantidadAgua; //o se puede escribir private int capacidad, cant agua
   public TanqueAgua(){
       capacidad=950; //litros
       cantidadAgua=0;
    }
    public int cantTurrilesNecesarios(){
        int res=capacidad/210;
        return res;
   }
   public int getCapacidad(){
       return capacidad;
    }
    public int getCantAgua(){
        return cantidadAgua;
    }
    public void setCapacidad(int nCapacidad){
        capacidad=nCapacidad;
    }
    public void setCantidadAgua(int nCantidadAgua){
        cantidadAgua=nCantidadAgua;
    }
}
