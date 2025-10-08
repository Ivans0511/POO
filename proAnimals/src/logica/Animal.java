package logica;

import java.util.Calendar;

public abstract class Animal {
    protected String nombre;
    protected double pesoKg;
    protected Calendar fechaNacimiento;

    public Animal(String nombre, double pesoKg, Calendar fechaNacimiento) {
        this.nombre = nombre;
        this.pesoKg = pesoKg;
        this.fechaNacimiento = fechaNacimiento;
    }

    public abstract double calcularCostoConsulta();

    public abstract String presentacion();

    public int getEdadAños() {
        Calendar hoy = Calendar.getInstance();
        int edad = hoy.get(Calendar.YEAR) - fechaNacimiento.get(Calendar.YEAR);
        if (hoy.get(Calendar.DAY_OF_YEAR) < fechaNacimiento.get(Calendar.DAY_OF_YEAR)) {
            edad--;
        }
        return edad;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre +
               ", Peso: " + pesoKg + "kg" +
               ", Fecha de nacimiento: " + fechaNacimiento.get(Calendar.DAY_OF_MONTH) + "/" +
               (fechaNacimiento.get(Calendar.MONTH) + 1) + "/" +
               fechaNacimiento.get(Calendar.YEAR);
    }
}
