package logica;

import java.time.LocalDate;
import java.util.Calendar;

public class Gato extends Animal {

    public Gato(String nombre, double pesoKg, Calendar fechaNacimiento) {
        super(nombre, pesoKg, fechaNacimiento);
    }

    @Override
    public double calcularCostoConsulta() {
        double costoBase = 28000;
        if (getEdadAños() < 1) {
            costoBase *= 0.9; // descuento del 10%
        }
        return costoBase;
    }

    @Override
    public String presentacion() {
        return "Miau! Soy " + nombre;
    }
}