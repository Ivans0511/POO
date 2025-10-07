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
public class ETemporal extends Empleado{
    private Calendar fechaAlta;
    private Calendar fechaBaja;
    private static final double SUELDO_MENSUAL_FIJO = 2000000;

    public ETemporal(Calendar fechaAlta, Calendar fechaBaja, String nombre, String fecha, String departamento){
        super(nombre, fecha, departamento);
        this.fechaAlta = fechaAlta;
        this.fechaBaja = fechaBaja;
    }

    public Calendar getFechaAlta() {
        return fechaAlta;
    }
    public void setFechaAlta(Calendar fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public Calendar getFechaBaja() {
        return fechaBaja;
    }
    public void setFechaBaja(Calendar fechaBaja) {
        this.fechaBaja = fechaBaja;
    }
    
    public boolean validarFechas() {
        if (fechaBaja != null && fechaAlta != null) {
            return !fechaBaja.before(fechaAlta);
        }
        return true; // Si alguna es null, no hay conflicto
    }
 
    @Override
    public double calcularSueldo(){
        return SUELDO_MENSUAL_FIJO;
    }
      
    @Override
    public String toString(){
        SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd");

        return super.toString() 
            + "\nFECHA ALTA: " + formato.format(fechaAlta.getTime())
            + "\nFECHA BAJA: " + formato.format(fechaBaja.getTime())
            + "\nSALARIO: " + calcularSueldo();
    }
          
}
