package logica;

/**
 *
 * @author ivans
 */
public class Libro {
    private String titulo;
    private Autor autor;
    private int codigo;
    private int paginas;
    private int edicion;
    private String editorial;
    private Lugar lugar;
    private Fecha fecha;

    public Libro(String titulo, Autor autor, int codigo, int paginas, int edicion, String editorial, Lugar lugar, Fecha fecha) {
        this.titulo = titulo;
        this.autor = autor;
        this.codigo = codigo;
        this.paginas = paginas;
        this.edicion = edicion;
        this.editorial = editorial;
        this.lugar = lugar;
        this.fecha = fecha;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }
    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getPaginas() {
        return paginas;
    }
    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public int getEdicion() {
        return edicion;
    }
    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    public String getEditorial() {
        return editorial;
    }
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public Lugar getLugar() {
        return lugar;
    }
    public void setLugar(Lugar lugar) {
        this.lugar = lugar;
    }

    public Fecha getFecha() {
        return fecha;
    }
    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }
    
    
    @Override
    public String toString(){
        return "LIBRO\n"
                + "TITULO "+titulo + "\n"
                + "AUTOR " + autor + "\n"
                + "CODIGO "+ codigo + "\n"
                + "PAGINAS "+ paginas + "\n"
                + "EDICION " + edicion + "\n"
                + "EDITORIAL " + editorial + "\n"
                + "LUGAR "+lugar + "\n"
                + "FECHA " + fecha; 
    }
}
