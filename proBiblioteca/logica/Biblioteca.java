package logica;

import java.util.ArrayList;

/**
 *
 * @author Ivan Andres Sierra Arrieta
 * 0222420035
 */
public class Biblioteca {
    private String nombre;
    private ArrayList<Libro> libros = new ArrayList();

    public Biblioteca(){
        
    }
    public Biblioteca(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }
    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }
    
    public int mostrarCantidadLibros(){
        return libros.size();
    }
    
    public boolean agregarLibro(int pos, Libro libro) {
        if (libros.size() == 0) {
            if (pos == 0) {
                libros.add(libro);
                return true;
            } else {
                return false; 
            }
        } else if (pos >= 0 && pos <= libros.size()) {
            libros.add(pos, libro);
            return true;
        }
        return false;
    }

    public boolean eliminarLibro(int pos){
        if(pos >=0 && pos < libros.size()){
            libros.remove(pos);
            return true;
        }
        return false;
    }
    
    public Libro obtenerLibro(int pos) {
        return libros.get(pos);
    }
    
    public Libro encontrarLibroTitulo(String titulo){
        for (Libro libro : libros ){
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                return libro;
            }
        }
        return null;
    }
    
    
}
