/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringilestrinbufferfaki;

/**
 *
 * @author onura
 */
public class Stringilestrinbufferfaki {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String k="java";
       int t=0;
        for (int i = 0; i < 1000; i++) {
           k=k+" x";
           System.out.println(k);
        }
      
     /* StringBuffer k=new StringBuffer("java");
        for (int i = 0; i < 1000; i++) {
            k.append(" x");
            System.out.println(k65m);
        }*/
    }
    
}
