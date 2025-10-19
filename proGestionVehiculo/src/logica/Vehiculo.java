package logica;

/**
 *
 * @author ivans
 */
public abstract class Vehiculo {
    protected String marca;
    protected String modelo;
    protected int año;
    protected boolean encendido = false;
    
    public Vehiculo (){
    }
    public Vehiculo (String marca, String modelo, int año){
        this.marca = marca;
        this.modelo = modelo;
        this.setAño(año);
    }
    
    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public int getAño(){
        return año;
    }
    public void setAño(int año){
        if(año<0){
            this.año = 2000;
        }else{
            this.año = año;  
        }
    }
    
    public boolean getEncendido(){
        return encendido;
    }
    public void setEncendido(boolean encendido){
        this.encendido = encendido;
    }
    
    public void encender(){
        encendido = true;
    }
    public void apagar() {
        encendido = false;
    }
    
    public String mostrarInfo(){
        return "INFORMACION DEL VEHICULO\n"
                + "\nMODELO: " +modelo
                + "\nMARCA: "+marca
                + "\nAÑO: " +año;
    }
    
}
