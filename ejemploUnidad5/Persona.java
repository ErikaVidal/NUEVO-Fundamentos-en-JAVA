

public class Persona
{
    private String nombre;
    private int edad, ci;
    public Persona (String nomb, int edad, int ci){
        nombre = nomb;
        this.edad=edad;
        this.ci=ci;
        
    }
    public int getCi(){
        return ci;
    }
    public int getEdad(){
        return edad;
    }
    public String getNombre(){
        return nombre;
    }
}
