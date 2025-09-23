/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vista;

import javax.swing.JOptionPane;
import logica.*;

/**
 *
 * @author ivans
 */
public class ProLinea {

    /**
     * @param args the command line arguments
     */
    static Punto p1 = new Punto();
    static Punto p2 = new Punto();
    static Linea l1 = new Linea(p1, p2);
    
    public static void menu(){
        double x1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la coordenada en X del punto 1"));
        p1.setX(x1);
        double y1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la coordenada en Y del punto 1"));
        p1.setY(y1);
        double x2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la coordenada en X del punto 2"));
        p2.setX(x2);
        double y2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la coordenada en Y del punto 2"));
        p2.setY(y2);
        
        int op;
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(null,"QUE DESEA HAACER"
                    + "\n1. Mover linea a la derecha"
                    + "\n2. Mover linea a la izquierda"
                    + "\n3. Mover linea hacia arriba"
                    + "\n4. Mover linea hacia abajo"
                    + "\n5. Mostrar coordenadas de la linea"
                    + "\n6. Ingresar otra linea"
                    + "\n7. Salir"));
            switch(op){
                case 1:
                    double moverd = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el desplazamiento"));
                    MoverLinea.moverDerecha(p1, p2, moverd);
                    JOptionPane.showMessageDialog(null, "Nueva posicion de la linea: \n"+ l1.toString());
                break;
                case 2:
                    double moveri = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el desplazamiento"));
                    MoverLinea.moverIzquierda(p1, p2, moveri);
                    JOptionPane.showMessageDialog(null, "Nueva posicion de la linea: \n"+ l1.toString());
                break;
                case 3:
                    double movera = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el desplazamiento"));
                    MoverLinea.moverArriba(p1, p2, movera);
                    JOptionPane.showMessageDialog(null, "Nueva posicion de la linea: \n"+ l1.toString());
                break; 
                case 4:
                    double moverb = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el desplazamiento"));
                    MoverLinea.moverAbajo(p1, p2, moverb);
                    JOptionPane.showMessageDialog(null, "Nueva posicion de la linea: \n"+ l1.toString());
                break;   
                case 5:
                    JOptionPane.showMessageDialog(null, l1.toString());
                break; 
                case 6:
                    menu();
                break; 
                case 7:
                    JOptionPane.showMessageDialog(null, "...");
                break; 
            }
        }while(op!=7);
        
    }
    
    public static void main(String[] args) {
        menu();
        
        /*
        Punto p1 = new Punto(1,2);
        Punto p2 = new Punto(2,4);
        Linea l1 = new Linea(p1,p2);
        System.out.println(p1.getX());
        System.out.println(p2.getX());
        System.out.println("----- DERECHA");
        MoverLinea.moverDerecha(p1, p2, 2);
        System.out.println(p1.getX());
        System.out.println(p2.getX());
        System.out.println(p1.toString()+""+p2.toString());
        System.out.println(l1);
        System.out.println("----- IZQUIERDA");
        MoverLinea.moverIzquierda(p1, p2, 2);
        System.out.println(p1.getX());
        System.out.println(p2.getX());
        System.out.println("----- ARRIBA");
        MoverLinea.moverArriba(p1, p2, 2);
        System.out.println(p1.getY());
        System.out.println(p2.getY());
        System.out.println("----- ABAJO");
        MoverLinea.moverAbajo(p1, p2, 2);
        System.out.println(p1.getY());
        System.out.println(p2.getY());
        */
        
        
    }
    
}
