
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

    @Test
    public void testDodaj4() {
        System.out.println("dodaj4");
        String a = "120";
        String b = "225";
        Dodawanie instance = new Dodawanie();
        String expResult = "34.5";
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
        int expResult = 0;
        int result = instance.checkEven(a, b);
        assertEquals(expResult, result);
    }

    @Test
    public void testDodajStrNum() {
        System.out.println("dodajStrNum");
        String a = "one";
        String b = "one";
        Dodawanie instance = new Dodawanie();
        String expResult = "2";
        String result = instance.dodaj(a, b);
        assertEquals(expResult, result);
    }

    @Test
    public void testDodajDouble() {
        System.out.println("dodajDouble");
        String a = "1.15";
        String b = "2.20";
        Dodawanie instance = new Dodawanie();
        String expResult = "3.35";
        String result = instance.dodaj(a, b);
        assertEquals(expResult, result);
    }

    @Test
    public void testDodajPomnozoneInt() {
        System.out.println("dodajPomnozoneInt");
        String a = "2*2";
        String b = "3*10";
        Dodawanie instance = new Dodawanie();
        String expResult = "34";
        String result = instance.dodaj(a, b);
        assertEquals(expResult, result);
    }

    @Test
    public void testPrzecinek() {
        System.out.println("testPrzecinek");
        String a = "0,5";
        String b = "0,5";
        Dodawanie instance = new Dodawanie();
        String expResult = "1.0";
        String result = instance.dodaj(a, b);
        assertEquals(expResult, result);
    }
    public void testDodajLiczbeJakoString() {
        System.out.println("testDodajLiczbeJakoString");
        String a = "one";
        String b = "zero";
        Dodawanie instance = new Dodawanie();
        String expResult = "1";
        String result = instance.dodaj(a, b);
        assertEquals(expResult, result);
}
