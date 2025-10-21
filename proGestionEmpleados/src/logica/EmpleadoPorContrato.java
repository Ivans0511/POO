package logica;

/**
 *
 * @author ivans
 */
public class EmpleadoPorContrato extends Empleado{
    public EmpleadoPorContrato(){
    }
    public EmpleadoPorContrato(String nombre, int id){
        super(nombre, id);
    }

    @Override
    public double calcularSueldo() {
        return SALARIO_BASE;
    }
   
    @Override
    public String mostrarDetalles(){
       return super.mostrarDetalles()+ "\n" + calcularSueldo();            
    }
}
