/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siting_karsilastirma;

import static java.lang.Character.toUpperCase;
import java.util.Locale;

/**
 *
 * @author onura
 */
public class Siting_karsilastirma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String a=" mert ";
       String b="mert";
       String c="Mert";
       String q="java bir dildir çünkine java bir dildir!!!";
       String replace=q.replace("java","c++");
       int z=20;
       String x=String.valueOf(z);
       System.out.println((a == null ? b == null : a.equals(b)));
       System.out.println(a.equals(c));
       System.out.println(a.equalsIgnoreCase(c));
       System.out.println(a.substring(1));
       System.out.println(c.toUpperCase());
       System.out.println(c.toLowerCase());
       System.out.println(a.trim());
       System.out.println(c.startsWith("ME"));
       System.out.println(c.endsWith("t"));
       System.out.println(c.charAt(2));
       System.out.println(c.length());
       System.out.println(x+20);
       System.out.println(q);
       System.out.println(replace);
    }
    
}
