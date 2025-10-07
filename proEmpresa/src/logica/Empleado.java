/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;
//abstract final static
//abstract: clase q no se puede instanciar
/**
 *
 * @author ivans
 */
public abstract class Empleado {
    protected String nombre;
    protected String fecha;
    protected String departamento;

    public Empleado() {
    }
    public Empleado(String nombre, String fecha, String departamento) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.departamento = departamento;
    }
    
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    public abstract double calcularSueldo();
    
    @Override
    public String toString(){
        return "NOMBRE " + nombre + "\n" + "FECHA DE NACIMIENTO " + fecha + "\n" +
                "DEPARTAMENTO " + departamento;
    }    
    
}
