package logica;

import java.time.LocalDate;
import java.util.Calendar;

public class Ave extends Animal {

    public Ave(String nombre, double pesoKg, Calendar fechaNacimiento) {
        super(nombre, pesoKg, fechaNacimiento);
    }

    @Override
    public double calcularCostoConsulta() {
        double costoBase = 20000;
        if (pesoKg < 0.2) {
            costoBase *= 1.05; // recargo del 5% por manejo especial
        }
        return costoBase;
    }

    @Override
    public String presentacion() {
        return "Pío! Soy " + nombre;
    }
}
