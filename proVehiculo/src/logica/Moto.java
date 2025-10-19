package logica;

/**
 *
 * @author ivans
 */
public class Moto extends Vehiculo {
    private int cilindrada;
    
    public Moto(){
        super();
        cilindrada = 0;
    }
    
    public Moto(String modelo, String marca, int año, double precioPorDia, int cilindrada){
        super(modelo, marca, año, precioPorDia);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }
    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    //500
    public double calcularPrecioAlquiler(int dias) {
        double precioTotal = precioPorDia*dias;
        double precioFinal;
        if(cilindrada>500){
            precioFinal = precioTotal*1.05;
        }
        else{
            precioFinal = precioTotal;
        }
        return precioFinal;
    }
    
    @Override
    public String toString(){
        return  "=== MOTO ===\n" +
               "Marca: " + marca + "\n" +
               "Modelo: " + modelo + "\n" +
               "Año: " + año + "\n" +
               "Precio por día: $" + precioPorDia + "\n" +
               "Cilindraje: " + cilindrada;
    }
    
}
