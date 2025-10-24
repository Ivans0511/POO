package logica;
import java.util.Calendar;
/**
 *
 * @author @author Ivan Sierra Arrieta-0222420035
 */

public class Perro extends Animal {

    public Perro(String nombre, double pesoKg, Calendar fechaNacimiento) {
        super(nombre, pesoKg, fechaNacimiento);
    }

    @Override
    public double calcularCostoConsulta() {
        double costo = 30000;
        if (pesoKg > 25) {
            costo = costo * 1.15;
        }
        return costo;
    }

    @Override
    public String presentacion() {
        return "Guau! Soy " + nombre;
    }
}