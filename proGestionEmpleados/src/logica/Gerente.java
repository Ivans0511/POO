package logica;

/**
 *
 * @author ivans
 */
public class Gerente extends Empleado {
    private double bono;
    
    public Gerente(){
    }
    public Gerente(String nombre, int id,double bono){
        super(nombre, id);
        this.setBono(bono);
    }

    public void setBono(double bono){
        if(bono<0){
            this.bono=0;
        }
        else{
            this.bono = bono;
        }
    }
    
    @Override
    public double calcularSueldo() {
        return SALARIO_BASE+bono;
    }
    
    @Override
    public String mostrarDetalles(){
       return super.mostrarDetalles()+ "\n" + calcularSueldo();            
    }
  
}
