package logica;

/**
 *
 * @author ivans
 */
public class Moto extends Vehiculo{
    private boolean tieneMaletero;
    
    public Moto(String marca, String modelo, int año, boolean tieneMaletero){
        super(marca, modelo, año);
        this.tieneMaletero = tieneMaletero;
    }
    
    public boolean isTieneMaletero(){
        return tieneMaletero;
    }
    public void setTieneMaletero(boolean tieneMaletero){
        this.tieneMaletero = tieneMaletero;
    }
    
    public void hacerCaballito(){
        if(encendido){
            System.out.println("maniobraa");
        }
        else{
            System.out.println("moto apagada");
        }
    }
    
    @Override
    public String mostrarInfo(){
        String tieneMaletero = (this.tieneMaletero) ? "Sí" : "No";
        return super.mostrarInfo() + "\n Tiene maletero " + tieneMaletero; 
    }
}
