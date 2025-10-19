package logica;

/**
 *
 * @author ivans
 */
public class Carro extends Vehiculo{
    private int numPuertas;
    
    public Carro(String marca, String modelo, int año, int numPuertas){
        super(marca, modelo, año);
        this.numPuertas = numPuertas;
    }
    
    public int getNumPuertas(){
        return numPuertas;
    }
    public void setNumPuertas(int numPuertas){
        if (numPuertas<0){
            numPuertas=1;
        }else{
            this.numPuertas = numPuertas;
        }
    }
    
    public void tocarBocina(){
        if (encendido){
            System.out.println("beep! beep!");
        }else {
            System.out.println("carro apagado");
        } 
    }
    
    @Override
    public String mostrarInfo(){
        return super.mostrarInfo() + "\n Num Puertas " + numPuertas; 
    }
    
}
