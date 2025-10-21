/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author ivans
 */
public class OperaFraccionario {
    public static void OperaFraccionario (){    
    }
    public static Fraccionario sumar (Fraccionario f1, Fraccionario f2){
       Fraccionario suma = new Fraccionario ();
       int num = f1.getNumerador() * f2.getDenominador()  + f1.getDenominador() * f2.getNumerador();
     
       
       int d= f1.getDenominador () * f2.getDenominador();
       suma.setNumerador(num);
       suma.setDenominador(d);
        return suma;
    }
    
    public static Fraccionario restar (Fraccionario f1, Fraccionario f2){
       Fraccionario resta = new Fraccionario ();
       int num = f1.getNumerador() * f2.getDenominador()  - f1.getDenominador() * f2.getNumerador();
       
       int d= f1.getDenominador () * f2.getDenominador();
       resta.setNumerador(num);
       resta.setDenominador(d);
        return resta;
    }
    public static Fraccionario multiplicar (Fraccionario f1, Fraccionario f2){
       Fraccionario mult = new Fraccionario ();
       int num= f1.getNumerador() * f2.getNumerador ();
       int d= f1.getDenominador() * f2.getDenominador ();
       
       mult.setNumerador(num);
       mult.setDenominador(d); 
       return mult;
    }
   
    public static Fraccionario dividir (Fraccionario f1, Fraccionario f2){
       Fraccionario div = new Fraccionario ();
       int num= f1.getNumerador() * f2.getDenominador ();
       int d= f1.getDenominador() * f2.getNumerador ();
       
       div.setNumerador(num);
       div.setDenominador(d); 
       return div;
   }
}
