package logica;
import java.util.Calendar;
/**
 *
 * @author @author Ivan Sierra Arrieta-0222420035
 */

public class Ave extends Animal {

    public Ave(String nombre, double pesoKg, Calendar fechaNacimiento) {
        super(nombre, pesoKg, fechaNacimiento);
    }

    @Override
    public double calcularCostoConsulta() {
        double costo = 20000;
        if (pesoKg < 0.2) {
            costo = costo * 1.05;
        }
        return costo;
    }

    @Override
    public String presentacion() {
        return "Pío! Soy " + nombre;
    }
}

