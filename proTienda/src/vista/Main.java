package vista;
import logica.*;

import javax.swing.*;

public class Main {
    static Cliente cliente = new Cliente("Ivan", "IV@uni.edu.co");
    static Producto producto1 = new Producto("Arroz", 3000, 1);
    static Producto producto2 = new Producto("Pollo", 4000, 2);
    static Pedido pedido = new Pedido("28-09-2001", cliente);


    public static void calcularTotal() {
        JOptionPane.showMessageDialog(null, "El total del pedido es: " + pedido.calcularTotal());
    }

    public static void agregarProducto() {
        int codigo = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el codigo del producto: \n" +
                "1. Arroz \n" +
                "2. Pollo"));
        switch (codigo) {
            case 1:
                pedido.agregarProductos(producto1);
                JOptionPane.showMessageDialog(null, "Producto agregado: \n" + producto1);
                break;
            case 2:
                pedido.agregarProductos(producto2);
                JOptionPane.showMessageDialog(null, "Producto agregado: \n" + producto2);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Codigo no valido");
                break;
        }

    }


    public static void menu() {
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
                    agregarProducto();
                    break;
                case 2:
                    calcularTotal();
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
        }while(op!=4);
    }


    public static void main(String[] args) {
        menu();
    }

}