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
    
    public String convertToStringNumber(String a){
        if(a == "one"){
            return "1";
        }else{
            return a;
        }
    }

    public String dodaj(String a, String b){
        a = convertToStringNumber(a);
        b = convertToStringNumber(b);

        try {
            
            Integer.parseInt(a);
            Integer.parseInt(b);
            return Integer.toString(Integer.parseInt(a) + Integer.parseInt(b));
        }
        catch( Exception e ) {
            return a+b;
        }
    
    }
}
