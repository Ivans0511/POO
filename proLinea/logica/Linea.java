/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author ivans
 */
public class Linea {
    private Punto a;
    private Punto b;

    public Linea (){
        this.a = new Punto();
        this.b = new Punto();
    }
    
    public Linea (Punto a, Punto b){
        this.a = a;
        this.b = b;
    }
    
    public Punto getA() {
        return a;
    }

    public void setA(Punto a) {
        this.a = a;
    }

    public Punto getB() {
        return b;
    }

    public void setB(Punto b) {
        this.b = b;
    }
    
    @Override
    public String toString(){
        return "La recta esta deda por los puntos ["+a+"] "+"["+b+"]";       
    }
}
