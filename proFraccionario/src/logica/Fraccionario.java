/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author ivans
 */
public class Fraccionario {
    private int numerador;
    private int denominador;
    
    public Fraccionario() {
        this.numerador = 1;
        this.denominador = 1;
     
    }


    public Fraccionario(int numerador, int denominador){
        this.numerador = numerador;
        this.denominador = denominador;
    }
    
    
    public int getNumerador(){
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() 
    {
        return denominador;
    }

    public void setDenominador(int denominador) 
    {
        this.denominador = denominador;
    }

    @Override
    public String toString() 
    {
        return "(" + numerador + "/" + denominador +")";
    }
}
