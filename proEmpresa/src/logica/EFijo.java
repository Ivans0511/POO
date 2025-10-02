/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author ivans
 */
public class EFijo extends Empleado {
    private Calendar fechaInicio;
    private static final double SALARIO_BASE = 250000;
    
    public EFijo() {
    }

    public EFijo(Calendar fechaInicio, String nombre, String fecha, String departamento) {
        super(nombre, fecha, departamento);
        this.fechaInicio = fechaInicio;
    }
    
    public Calendar getFechaInicio() {
        return fechaInicio;
    }
    public void setFechaInicio(Calendar fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    
    @Override
    public double calcularSueldo(){
        // Calcular años de servicio
        Calendar fechaActual = Calendar.getInstance();
        int años = fechaActual.get(Calendar.YEAR) - fechaInicio.get(Calendar.YEAR);

        // Definir el complemento anual (necesitas determinarlo según tu ejercicio)
        double COMPLEMENTO_ANUAL = 50000;

        return SALARIO_BASE + (COMPLEMENTO_ANUAL * años);
    }
          
    @Override
    public String toString(){
        SimpleDateFormat formato = new SimpleDateFormat("dd/mm/yyyy");
        
        return  super.toString() + "\nFecha inicio "
                + formato.format(fechaInicio.getTime())
                + "\nSALARIO " + calcularSueldo();
    }
    
}
