package logica;

/**
 *
 * @author ivans
 */
public abstract class Empleado {
    protected String nombre;
    protected int id;
    protected final double SALARIO_BASE = 2000000;
          
    public Empleado(){
        
    }
    public Empleado(String nombre, int id){
        this.nombre = nombre;
        this.id = id;
    }
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    
    public double getSALARIO_BASE(){
        return SALARIO_BASE;
    }  
    
    public String mostrarDetalles(){
        return "INFORMACION DEL EMPLEADO"
                + "\nNombre " + nombre 
                + "\nid " + id;
    }
    
    public abstract double calcularSueldo();
    
}
