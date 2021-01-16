/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.amu.wmi.bikol.dino.arytmetyka;

/**
 *
 * @author bikol
 */
public class Dodawanie {
    
    public String dodaj(String a, String b){
    try {
        Integer.parseInt(a);
        Integer.parseInt(b);
        
        if( Integer.parseInt(a) >= 100 && Integer.parseInt(a) <=999 && Integer.parseInt(b) >= 100 && Integer.parseInt(b) <= 999){
            double n1 = Integer.parseInt(a);
            double n2 = Integer.parseInt(b);
            n1 = n1 / 10;
            n2 = n2 / 10;
            return Double.toString(n1+n2);
        }
        
        return Integer.toString(Integer.parseInt(a) + Integer.parseInt(b));
    }
    catch( Exception e ) {
        return a+b;
        }
    
    }
}
