package logica;
import java.util.Calendar;
/**
 *
 * @author @author Ivan Sierra Arrieta-0222420035
 */
public class Gato extends Animal {

    public Gato(String nombre, double pesoKg, Calendar fechaNacimiento) {
        super(nombre, pesoKg, fechaNacimiento);
    }

    @Override
    public double calcularCostoConsulta() {
        double costo = 28000;
        if (getEdadAnios() < 1) {
            costo = costo * 0.90;
        }
        return costo;
    }

    @Override
    public String presentacion() {
        return "Miau! Soy " + nombre;
    }
}