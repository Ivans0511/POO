package logica;

/**
 *
 * @author ivans
 */
public class Desarrollador extends Empleado{
    private int horasExtra;
    private final double PAGO_POR_HORAS=60000;
    
    public Desarrollador(){
    }
    public Desarrollador(String nombre, int id, int horasExtra){
        super(nombre, id);
        this.setHorasExtra(horasExtra);
    }

    public int getHorasExtra(){
        return horasExtra;
    }
    public void setHorasExtra(int horasExtra){
        if(horasExtra<0){
            this.horasExtra=0;
        }
        else{
            this.horasExtra = horasExtra;
        }
    }
       
    @Override
    public double calcularSueldo() {
        // Retorna el salario base más el producto de las horas extra por el pago por hora.
        return SALARIO_BASE + (this.horasExtra * PAGO_POR_HORAS);
    }
    
    @Override
    public String mostrarDetalles() {
       // Llama al método del padre y añade la información específica del desarrollador.
       return super.mostrarDetalles() 
               + "\nHoras Extra: " + this.horasExtra
               + "\nSalario Total: " + this.calcularSueldo();
    }
}
