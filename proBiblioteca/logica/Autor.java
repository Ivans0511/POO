package logica;

import java.util.ArrayList;

/**
 *
 * @author Ivan Andres Sierra Arrieta
 * 0222420035
 */
public class Autor {
    private String nombre;
    private int cedula;
    private String nacionalidad;
    ArrayList<String> libros = new ArrayList<>();
    //volver aqui
    public Autor(String nombre, int cedula, String nacionalidad) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }
    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getLibros() {
        return libros.toString();
    }
    public void setLibros(ArrayList<String> libros) {
        this.libros = libros;
    }

    public void agregarLibro(String libro) {
        this.libros.add(libro);
    }

    @Override
    public String toString(){
        return "" +
                "\nnombre " + nombre + '\'' +
                "\ncédula " + cedula +
                "\nnacionalidad " + nacionalidad + '\'' +
                "\nlibros [" + libros.toString() + "]"
                ;
    }

}

