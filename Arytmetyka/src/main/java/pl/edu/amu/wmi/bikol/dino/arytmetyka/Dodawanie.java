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
        Double.parseDouble(a);
        Double.parseDouble(b);
        double wynik= Double.parseDouble(a) + Double.parseDouble(b);
        if(wynik == (long)wynik)
            return String.format("%d",(long)wynik);
        else
            return String.format("%s",wynik);
    }
    catch( Exception e ) {
        return a+b;
        }
    
    }
}
