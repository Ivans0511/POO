package logica;

/**
 *
 * @author ivans
 */
public class Carro extends Vehiculo{
    private String tipoCombustible;
    
    public Carro(){
        super();
        tipoCombustible = "";
    }
    public Carro(String modelo, String marca, int año, double precioPorDia, String tipoCombustible){
        super(modelo, marca, año, precioPorDia);
        this.tipoCombustible = tipoCombustible;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }
    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }
       
    @Override
    public double calcularPrecioAlquiler(int dias) {
        double precioTotal = precioPorDia*dias;
        double precioFinal;
        if(tipoCombustible.equalsIgnoreCase("electrico")){
            precioFinal = precioTotal * 0.90;
        } else {
            // Sin descuento, precio completo
            precioFinal = precioTotal;
        }
        return precioFinal;
    }
    
    @Override
    public String toString(){
        return  "=== CARRO ===\n" +
               "Marca: " + marca + "\n" +
               "Modelo: " + modelo + "\n" +
               "Año: " + año + "\n" +
               "Precio por día: $" + precioPorDia + "\n" +
               "Tipo de combustible: " + tipoCombustible;
    }
}
