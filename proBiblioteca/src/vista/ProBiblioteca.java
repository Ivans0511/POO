package vista;

import javax.swing.JOptionPane;
import logica.*;

/**
 *
 * @author Ivan Sierra Arrieta 
 * 0222420035
 */
public class ProBiblioteca{
    
    public static void menu(){
        int op;
        Biblioteca biblioteca = new Biblioteca();
        
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog("QUE DESEA HACER? "
                    + "\n1. CANTIDAD DE LIBROS"
                    + "\n2. AGREGAR LIBRO"
                    + "\n3. ELIMINAR LIBRO"
                    + "\n4. OBTENER LIBRO POR POSICION"
                    + "\n5. BUSCAR LIBRO POR TITULO"
                    + "\n6. SALIR"));
            
            switch (op){
                case 1:
                    JOptionPane.showMessageDialog(null, biblioteca.mostrarCantidadLibros());
                break;
                case 2:
                    String titulo = JOptionPane.showInputDialog(null, "Ingrese el titulo del libro");
                    String nomAutor = JOptionPane.showInputDialog(null, "Ingrese el nombre del autor");
                    int cc = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la CC del autor"));
                    String nacionalidad = JOptionPane.showInputDialog(null, "Ingrese la nacionalidad dela autor");
                    int codigo = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el codigo del libro"));
                    int paginas = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de paginas"));
                    int edicion= Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la edicion del libro"));
                    String editorial = JOptionPane.showInputDialog(null, "Ingrese la editorial del libro");
                    String ciudad = JOptionPane.showInputDialog(null, "Ingrese la ciudad");
                    String pais = JOptionPane.showInputDialog(null, "Ingrese el pais");             
                    int dia = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el dia de lanzamiento"));
                    int mes = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el mes de lanzamiento"));
                    int año = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el año de lanzamiento"));
                    
                    Lugar lugar = new Lugar(ciudad, pais);
                    Fecha fecha = new Fecha(dia, mes, año);
                    Autor autor = new Autor(nomAutor, cc, nacionalidad);
                    autor.agregarLibro(titulo);
                    Libro libro = new Libro(titulo, autor, codigo, paginas, edicion, editorial, lugar, fecha);
                    
                    int pos = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la posicion en la que quiere añadir el libro entre 0 y "+ biblioteca.mostrarCantidadLibros()));
                    if (biblioteca.agregarLibro(pos, libro)){
                        JOptionPane.showMessageDialog(null, "libro agregado exitosamente");
                    }else{
                        JOptionPane.showMessageDialog(null, "No se pudo agregar el libro, posicion invalida");
                    }   
                break;
                case 3: 
                    int pos2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la posicion del libro que desea eliminar"));
                    if (biblioteca.eliminarLibro(pos2)){
                        JOptionPane.showMessageDialog(null, "LIBRO ELIMINADO ");
                        biblioteca.eliminarLibro(pos2);
                    }else {
                        JOptionPane.showMessageDialog(null, "POSICION INVALIDA, NO SE ELIMINO NINGUN LIBRO");
                    }
                break;
                case 4:
                    int cantidadLibros = biblioteca.mostrarCantidadLibros();
                    if (cantidadLibros == 0) {
                        JOptionPane.showMessageDialog(null, "No hay libros disponibles.");
                    } else {
                        int posO = Integer.parseInt(JOptionPane.showInputDialog(null, 
                            "Ingrese la posición del libro entre 0 y " + (cantidadLibros - 1)));
                        JOptionPane.showMessageDialog(null, biblioteca.obtenerLibro(posO)); 
                    }
                break;
                case 5:
                    int cantidadLibross = biblioteca.mostrarCantidadLibros();
                    if (cantidadLibross == 0) {
                        JOptionPane.showMessageDialog(null, "No hay libros disponibles para buscar.");
                    } else {
                        String titulob = JOptionPane.showInputDialog(null, "Ingrese el título del libro");
                        Libro libroEncontrado = biblioteca.encontrarLibroTitulo(titulob);
                        if (libroEncontrado != null) {
                            JOptionPane.showMessageDialog(null, "Libro encontrado"
                                    + "\n" + libroEncontrado.toString());
                        } else {
                            JOptionPane.showMessageDialog(null, "Libro no encontrado");
                        }
                    }
            }
        }while (op!=6);
        
        
    }
    public static void main(String[] args) {
        menu();
    }
    
}
