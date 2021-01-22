/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.amu.wmi.bikol.dino.arytmetyka;

import java.text.DecimalFormat;

/**
 *
 * @author bikol
 */
public class Dodawanie {
    
    public String dodaj(String a, String b){
        
    if (a.contains(".") && b.contains(".")) {
        DecimalFormat df = new DecimalFormat("#.##"); 
        
        return Double.toString(Double.valueOf(df.format(Double.parseDouble(a) + Double.parseDouble(b))));
    }
        
    try {
       Double.parseDouble(a);
        Double.parseDouble(b);
        double wynik = Math.round(Double.parseDouble(a)) + Math.round(Double.parseDouble(b));
        if(wynik == (long)wynik)
            return String.format("%d",(long)wynik);
        else
            return String.format("%s",wynik); 
    }
    catch( Exception e ) {
        return a+b;
        }
    
    }
    
    public int checkEven(int a, int b){
        
        if((a+b)%2 == 0) {
            return 1;
        } else {
            return 0;
        }
    }
}
