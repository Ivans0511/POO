package logica;

/**
 *
 * @author ivans
 */
public abstract class Vehiculo {
    protected String modelo;
    protected String marca;
    protected int año;
    protected double precioPorDia;
    
    public Vehiculo(){
        modelo = "";
        marca = "";
        año = 0;
        precioPorDia = 0.0;
    }
    public Vehiculo(String modelo, String marca, int año, double precioPorDia){
        this.modelo = modelo;
        this.marca = marca;
        this.año = año;
        this.precioPorDia = precioPorDia;
    }
    
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public int getAño(){
        return año;
    }
    public void setAño(int año){
        if(año<0){
            this.año = año;
        }
        else{
            año = 0;
        }
    }

    public double getPrecioPorDia() {
        return precioPorDia;
    }
    public void setPrecioPorDia(double precioPorDia) {
        if(precioPorDia<0){
            System.out.println("ERROR");
        }else{
            this.precioPorDia = precioPorDia;
        }
    }
    
    public abstract double calcularPrecioAlquiler(int dias);
    
    @Override
    public String toString(){
        return "Marca: " + marca + "\n" +
               "Modelo: " + modelo + "\n" +
               "Año: " + año + "\n" +
               "Precio por día: $" + precioPorDia;
    }
}
