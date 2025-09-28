package logica;

import java.util.ArrayList;

public class Pedido {
    Cliente cliente;
    private String fecha;
    private ArrayList<Producto> productos;

    public Pedido() {
    }

    public Pedido(String fecha, Cliente cliente) {
        this.cliente = cliente;
        this.fecha = fecha;
        productos = new ArrayList<>();
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public boolean agregarProductos(Producto p) {
        return productos.add(p);
    }

    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) {
            total += p.getPrecio();
        }
        return total;
    }



    @Override
    public String toString() {
        return "Pedido" +
                "\n[Cliente: " + cliente + "] " +
                "\n[fecha: " + fecha + "] " +
                "\n[total: " + calcularTotal() + "] " +
                "\n[productos: " + productos + "]";
    }

}
