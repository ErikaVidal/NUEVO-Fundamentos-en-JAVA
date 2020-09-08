

public class BombaAgua
{
    private int cantAguaTrans; //litros
    private Turril turrilConectado;
    private TanqueAgua tanqueConectado;
    public BombaAgua(){ //public BombaAgua(int cantAguaTrans){this.cantAguaTrans=cantAguaTrans;}
        cantAguaTrans=7;
    }
    public void bombear(){
        int cantidadAguaTurril=turrilConectado.getCantidadAgua();
        cantidadAguaTurril=cantidadAguaTurril-cantAguaTrans;
        turrilConectado.setCantidadAgua(cantidadAguaTurril);
        int cantidadAguaTanque=tanqueConectado.getCantAgua();
        cantidadAguaTanque=cantidadAguaTanque+cantAguaTrans;
        tanqueConectado.setCantidadAgua(cantidadAguaTanque);
        
    }
    public int cantVecesBombear(){
        int res=210/cantAguaTrans;
        return res;
    }
    public void conectarTurril(Turril turril){
        turrilConectado=turril;
    }
    public void conectarTanque(TanqueAgua tanque){
        tanqueConectado=tanque;
    }
}
