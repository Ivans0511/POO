package logica;

import java.time.LocalDate;
import java.util.Calendar;

public class Perro extends Animal {

    public Perro(String nombre, double pesoKg, Calendar fechaNacimiento) {
        super(nombre, pesoKg, fechaNacimiento);
    }

    @Override
    public double calcularCostoConsulta() {
        double costoBase = 30000;
        if (pesoKg > 25) {
            costoBase *= 1.15;
        }
        return costoBase;
    }

    @Override
    public String presentacion() {
        return "Guau! Soy " + nombre;
    }
}