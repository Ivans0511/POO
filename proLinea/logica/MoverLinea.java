/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author ivans
 */
public class MoverLinea {
    public static void moverDerecha(Punto a, Punto b, double mover){
        a.setX(a.getX()+mover);
        b.setX(b.getX()+mover);
    }
    public static void moverIzquierda(Punto a, Punto b, double mover){
        a.setX(a.getX()-mover);
        b.setX(b.getX()-mover);
    }
    public static void moverAbajo(Punto a, Punto b, double mover){
        a.setY(a.getY()-mover);
        b.setY(b.getY()-mover);
    }
    public static void moverArriba(Punto a, Punto b, double mover){
        a.setY(a.getY()+mover);
        b.setY(b.getY()+mover);
    }
    
}
