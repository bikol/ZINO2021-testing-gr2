/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.amu.wmi.bikol.dino.arytmetyka;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

/**
 *
 * @author bikol
 */
public class DodawanieTest {
    
    public DodawanieTest() {
    }

    @BeforeAll
    public static void setUpClass() throws Exception {
    }

    @AfterAll
    public static void tearDownClass() throws Exception {
    }

    @BeforeEach
    public void setUp() throws Exception {
    }

    @AfterEach
    public void tearDown() throws Exception {
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


    /**
     * Test of checkEven method, of class Dodawanie.
     */
    @Test
    public void testCheckEven() {
        System.out.println("checkEven");
        int a = 3;
        int b = 4;
        Dodawanie instance = new Dodawanie();
        int expResult = 1;
        int result = instance.checkEven(a, b);
        assertEquals(expResult, result);
    }

    
    
}
