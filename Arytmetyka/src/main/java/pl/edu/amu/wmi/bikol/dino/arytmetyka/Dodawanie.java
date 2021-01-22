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
        Integer.parseInt(a);
        Integer.parseInt(b);
        return Integer.toString(Integer.parseInt(a) + Integer.parseInt(b));
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
