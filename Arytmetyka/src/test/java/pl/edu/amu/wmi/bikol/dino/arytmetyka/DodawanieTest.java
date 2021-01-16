/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.amu.wmi.bikol.dino.arytmetyka;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author bikol
 */
public class DodawanieTest {
    
    public DodawanieTest() {
    }

    @Test
    public void testDodaj1() {
        System.out.println("dodaj1");
        String a = "1";
        String b = "1";
        Dodawanie instance = new Dodawanie();
        String expResult = "2";
        String result = instance.dodaj(a, b);
        assertEquals(expResult, result);
    }
        @Test
    public void testDodaj2() {
        System.out.println("dodaj2");
        String a = "1";
        String b = "0";
        Dodawanie instance = new Dodawanie();
        String expResult = "1";
        String result = instance.dodaj(a, b);
        assertEquals(expResult, result);
    }
    @Test
    public void testDodajStr() {
        System.out.println("dodajStr");
        String a = "string1";
        String b = "string2";
        Dodawanie instance = new Dodawanie();
        String expResult = "string1string2";
        String result = instance.dodaj(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testDodajDecimal() {
        System.out.println("dodajDecimal");
        String a = "1.10";
        String b = "2.20";
        Dodawanie instance = new Dodawanie();
        String expResult = "3.30";
        String result = instance.dodaj(a, b);
        assertEquals(expResult, result);
    }
}
