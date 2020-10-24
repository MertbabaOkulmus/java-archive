/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package degiskensinirlari;

/**
 *
 * @author onura
 */
public class Degiskensinirlari {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println(Integer.MAX_VALUE);
       System.out.println(Integer.MIN_VALUE);
       System.out.println("------");
       System.out.println(Double.MAX_VALUE);
       System.out.println(Double.MIN_VALUE);
       System.out.println("------");
       System.out.println(Float.MAX_VALUE);
       System.out.println(Float.MIN_VALUE);
       System.out.println("-------");
       System.out.println(Byte.MAX_VALUE);
       System.out.println(Byte.MIN_VALUE);
       
       int x=10;
       int y=11;
       System.out.println(x++);
       System.out.println(++x);
       System.out.println(--x);
       
       System.out.println(y++ + --y);     
       System.out.println(--y + x++);
       System.out.println(x);
       System.out.println(y);
       
       int a=10,b=20;
       System.out.println(a==b ? "evet":"hayır");
       
       
    }
    
}
