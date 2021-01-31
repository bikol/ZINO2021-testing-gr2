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

    public String convertToStringNumber(String a) {
        switch (a) {
            case "zero": return "0";
            case "one": return "1";
            case "two": return "2";
            default: return a;
        }
    }

    public String dodaj(String a, String b) {
        if (a.contains("*") || b.contains("*")) {
            int a_pos = a.indexOf("*");
            int b_pos = b.indexOf("*");
            String part1;
            String part2;

            if (a_pos != -1 && b_pos != -1) // jesli oba stringi sa w postaci mnozenia
            {
                part1 = a.substring(0, a_pos);
                part2 = a.substring(a_pos + 1);
                a = String.valueOf(Integer.parseInt(part1) * Integer.parseInt(part2));
                part1 = b.substring(0, b_pos);
                part2 = b.substring(b_pos + 1);
                b = String.valueOf(Integer.parseInt(part1) * Integer.parseInt(part2));
            } else {
                if (a_pos != -1) // jesli string a jest w postaci mnozenia
                {
                    part1 = a.substring(0, a_pos);
                    part2 = a.substring(a_pos + 1);
                    a = String.valueOf(Integer.parseInt(part1) * Integer.parseInt(part2));
                } else // jesli str b jest w postaci mnozenia
                {
                    part1 = b.substring(0, b_pos);
                    part2 = b.substring(b_pos + 1);
                    b = String.valueOf(Integer.parseInt(part1) * Integer.parseInt(part2));
                }
            }
            
            return String.valueOf(Integer.parseInt(a) + Integer.parseInt(b));
        } else {
            if (a.equals("0,5")) {
            a = "0.5";
            }
            if (b.equals("0,5")) {
            b = "0.5";
            }
            a = convertToStringNumber(a);
            b = convertToStringNumber(b);
            if (a.contains(".") && b.contains(".")) {
                DecimalFormat df = new DecimalFormat("#.##");

                return Double.toString(Double.valueOf(df.format(Double.parseDouble(a) + Double.parseDouble(b))));
            }

            try {
                Integer.parseInt(a);
                Integer.parseInt(b);

                if (Integer.parseInt(a) >= 100 && Integer.parseInt(a) <= 999 && Integer.parseInt(b) >= 100
                        && Integer.parseInt(b) <= 999) {
                    double n1 = Integer.parseInt(a);
                    double n2 = Integer.parseInt(b);
                    n1 = n1 / 10;
                    n2 = n2 / 10;
                    return Double.toString(n1 + n2);
                }

                return Integer.toString(Integer.parseInt(a) + Integer.parseInt(b));
            } catch (Exception e) {
                return a + b;
            }
        }
    }

    public int checkEven(int a, int b) {

        if ((a + b) % 2 == 0) {
            return 1;
        } else {
            return 0;
        }
    }
}
