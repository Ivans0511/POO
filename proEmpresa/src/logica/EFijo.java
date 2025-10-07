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
    private static final double SALARIO_BASE = 2000000;
    
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
    
    private int calcularFecha(Calendar fechaInicio){
        // Calcular años de servicio
        Calendar fechaActual = Calendar.getInstance();
        final int AÑOS = fechaActual.get(Calendar.YEAR) - fechaInicio.get(Calendar.YEAR);
        return AÑOS;
    }
    
    @Override
    public double calcularSueldo(){
        int AÑOS = calcularFecha(fechaInicio);
        final double COMPLEMENTO_ANUAL = 50000;

        return SALARIO_BASE + (COMPLEMENTO_ANUAL * AÑOS);
    }
          
    @Override
    public String toString(){
        SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd");
        
        return  super.toString() + "\nFECHA INICIO: "
                + formato.format(fechaInicio.getTime())
                + "\nSALARIO: " + calcularSueldo();
    }
    
}
