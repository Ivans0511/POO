/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author ivans
 */
public class EHora extends Empleado{
    private static final double PRECIO_HORA = 25000;
    private int numHorasTrabajadas;

    public EHora() {
    }

    public EHora(int numHorasTrabajadas, String nombre, String fecha, String departamento) {
        super(nombre, fecha, departamento);
        this.numHorasTrabajadas = numHorasTrabajadas;
    }

    public int getNumHorasTrabajadas() {
        return numHorasTrabajadas;
    }
    public void setNumHorasTrabajadas(int numHorasTrabajadas) {
        this.numHorasTrabajadas = numHorasTrabajadas;
    }

    @Override
    public double calcularSueldo(){
        return this.numHorasTrabajadas * PRECIO_HORA;
    }
      
    @Override
    public String toString(){
        return super.toString() + "\nPRECIO HORA: "
                + PRECIO_HORA + "\nNUMERO DE HORAS TRABAJADAS " + numHorasTrabajadas
                + "\nSALARIO "+ calcularSueldo();
    }
}
