package vista;
import logica.*;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Cliente cliente = new Cliente("Ivan", "IV@uni.edu.co");
        Pedido pedido = new Pedido("28-09-2001", cliente);

        int op;
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Seleccione una opcion: \n" +
                            "1. Agregar producto \n" +
                            "2. Calcular total \n" +
                            "3. Mostrar pedido \n" +
                            "4. Salir"));

            switch (op) {
                case 1:
                    agregarProducto(pedido);
                    break;
                case 2:
                    calcularTotal(pedido);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, pedido);
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Saliendo...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida");
                    break;
            }
        } while (op != 4);
    }

    public static void agregarProducto(Pedido pedido) {
        int codigo = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el codigo del producto: \n" +
                "1. Arroz \n" +
                "2. Pollo"));

        Producto producto = null;
        switch (codigo) {
            case 1:
                producto = new Producto("Arroz", 3000, 1);
                break;
            case 2:
                producto = new Producto("Pollo", 4000, 2);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Codigo no valido");
                return;
        }
        pedido.agregarProductos(producto);
        JOptionPane.showMessageDialog(null, "Producto agregado: \n" + producto);
    }

    public static void calcularTotal(Pedido pedido) {
        JOptionPane.showMessageDialog(null, "El total del pedido es: " + pedido.calcularTotal());
    }
}