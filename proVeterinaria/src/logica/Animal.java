package logica;

import java.util.Calendar;

/**
 *
 * @author Ivan Sierra Arrieta-0222420035
 */

public abstract class Animal {
    protected String nombre;
    protected double pesoKg;
    protected final Calendar fechaNacimiento;

    public Animal(String nombre, double pesoKg, Calendar fechaNacimiento) {
        this.nombre = nombre;
        this.pesoKg = pesoKg;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public double getPesoKg() {
        return pesoKg;
    }
    public void setPesoKg(double pesoKg) {
        this.pesoKg = pesoKg;
    }
    
    public Calendar getFechaNacimiento() {
        return fechaNacimiento;
    }

    public int getEdadAnios() {
        Calendar hoy = Calendar.getInstance();
        int edad = hoy.get(Calendar.YEAR) - fechaNacimiento.get(Calendar.YEAR);
        return edad;
    }

    public abstract double calcularCostoConsulta();
    public abstract String presentacion();
  
    @Override
    public String toString(){
        return "NOMBRE: " + nombre + "\nPESO: " + pesoKg
                + "FECHA_NACIMIENTO " + fechaNacimiento;
    }
    
}
    
